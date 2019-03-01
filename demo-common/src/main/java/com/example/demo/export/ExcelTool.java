package com.example.demo.export;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExcelTool {

  private static final String TPL_PATH = "/WEB-INF/excel/blank.xls";

  private static final Logger logger = LoggerFactory.getLogger(ExcelTool.class);

  private List<Caption> captions;
  private List<DataRow> results;
  private List<DataColumn> colResults;

  /**
   * 为了集中学习时的第二页列表出去
   */
  private List<Caption> captionsSec;
  /**
   * 为了集中学习时的第二页列表出去
   */
  private List<DataRow> otherResults;

  public ExcelTool() {
  }

  public ExcelTool(List<Caption> captions, List<DataRow> results) {
    this.captions = captions;
    this.results = results;
  }

  /**
   * 第二页是列表的导出初始化
   */
  public ExcelTool(List<Caption> captions, List<DataColumn> colResults, List<Caption> captionsSec,
      List<DataRow> otherResults) {
    this.captions = captions;
    this.colResults = colResults;
    this.otherResults = otherResults;
    this.captionsSec = captionsSec;
  }

  /**
   * 用于列的导出构造类，titile预留参数
   */
  public ExcelTool(List<Caption> captions, List<DataColumn> colResults, String titile) {
    this.captions = captions;
    this.colResults = colResults;
  }


  private void init(HttpServletResponse resp, String fileName) {
    String fullName = fileName + ".xls";
    resp.setCharacterEncoding("utf-8");
    resp.reset();
    resp.setHeader("content-Type", "application/vnd.ms-excel");
    try {
      resp.setHeader("Content-Disposition", "attachment; fileName=" + fullName
          + ";filename*=utf-8''" + URLEncoder.encode(fullName, "UTF-8"));
    } catch (UnsupportedEncodingException e) {
      logger.error("init response header error", e);
    }
  }

  public void export(HttpServletRequest request, HttpServletResponse response, String fileName) {
    init(response, fileName);
    String destPath = request.getRealPath(TPL_PATH);
    ServletOutputStream fOut = null;
    HSSFWorkbook workbook = null;
    try {
      workbook = new HSSFWorkbook(new FileInputStream(destPath));
      HSSFSheet sheet = workbook.getSheetAt(0);
      HSSFCellStyle captionStyle = getCaptionStyle(workbook, (short) 240);
      HSSFCellStyle centerStyle = getCenterStyle(workbook, (short) 240);
      HSSFCellStyle numberStyle = getRightStyle(workbook, (short) 240);
      HSSFCellStyle charStyle = getLeftStyle(workbook, (short) 240);
      HSSFCellStyle titleStyle = getTitleStyle(workbook, (short) 60);
      int rowIndex = 2, cellIndex = 0;
      HSSFCell cell;
      HSSFRow row;

      row = sheet.createRow((short) 1);
      row.setHeight((short) 700);
      sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, captions.size()));
      cell = row.createCell(0);
      cell.setCellStyle(titleStyle);
      sheet.getRow((short) 1).getCell(0).setCellValue(fileName);
      // 头部中文
      // 创建行
      row = sheet.createRow((short) rowIndex);
      rowIndex++;
      row.setHeight((short) 850);
      cell = row.createCell(cellIndex);
      cell.setCellStyle(captionStyle);
      cell.setCellValue("序号");
      cellIndex++;
      // 创建行
      for (int i = 0; i < captions.size(); i++) {
        cell = row.createCell(cellIndex);
        cell.setCellStyle(centerStyle);
        Caption cap = captions.get(i);
        sheet.setColumnWidth(i + 1, cap.getWidth());
        cell.setCellValue(cap.getName());
        cellIndex++;
      }
      for (int j = 0; j < results.size(); j++) {
        DataRow dRow = results.get(j);
        row = sheet.createRow((short) rowIndex);
        rowIndex++;
        row.setHeight((short) 600);
        cellIndex = 0;
        cell = row.createCell(cellIndex);
        cell.setCellStyle(centerStyle);
        cell.setCellValue(j + 1);
        cellIndex++;

        for (int i = 0; i < captions.size(); i++) {
          Caption cap = captions.get(i);
          String property = cap.getProperty();

          cell = row.createCell(cellIndex);
          if (cap.getAlign() == Caption.ALIGN_LEFT) {
            cell.setCellStyle(charStyle);
          } else if (cap.getAlign() == Caption.ALIGN_RIGHT) {
            cell.setCellStyle(numberStyle);
          } else if (cap.getAlign() == Caption.ALIGN_CENTER) {
            cell.setCellStyle(centerStyle);
          }
          if (dRow.loadValue(property) == null) {
            if (cap.getType() == Caption.TYPE_STRING) {
              cell.setCellValue("");
            } else {
              cell.setCellValue(0);
            }
          } else {
            if (cap.getType() == Caption.TYPE_STRING) {
              cell.setCellValue(dRow.loadStringValue(property));
            } else if (cap.getType() == Caption.TYPE_INT) {
              cell.setCellValue(dRow.loadIntValue(property));
            } else if (cap.getType() == Caption.TYPE_DOUBLE) {
              cell.setCellValue(dRow.loadDoubleValue(property));
            }
          }
          cellIndex++;
        }
      }
      fOut = response.getOutputStream();
      workbook.write(response.getOutputStream());
      fOut.flush();
    } catch (IOException e) {
      logger.error("处理数据异常", e);
    } finally {
      if (fOut != null) {
        try {
          fOut.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
      if (null != workbook) {
        try {
          workbook.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
    }

  }

  private HSSFCellStyle getLeftStyle(HSSFWorkbook workbook, short fh) {
    HSSFFont font = workbook.createFont();
    font.setColor(HSSFColor.BLACK.index);
    font.setFontHeightInPoints((short) 10);// 设置字体大小
    font.setFontName("宋体");
    font.setFontHeight(fh);

    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
    style.setWrapText(true);
    // 设置边框
    style.setBottomBorderColor(HSSFColor.BLACK.index);
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);
    return style;
  }

  private HSSFCellStyle getCenterStyle(HSSFWorkbook workbook, short fh) {
    HSSFFont font = workbook.createFont();
    font.setColor(HSSFColor.BLACK.index);
    font.setFontHeightInPoints((short) 10);// 设置字体大小
    font.setFontName("宋体");
    font.setFontHeight(fh);

    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
    style.setWrapText(true);
    // 设置边框
    style.setBottomBorderColor(HSSFColor.BLACK.index);
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);
    return style;
  }

  private HSSFCellStyle getRightStyle(HSSFWorkbook workbook, short fh) {
    HSSFFont font = workbook.createFont();
    font.setColor(HSSFColor.BLACK.index);
    font.setFontHeightInPoints((short) 10);// 设置字体大小
    font.setFontName("宋体");
    font.setFontHeight(fh);

    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
    style.setWrapText(true);
    // 设置边框
    style.setBottomBorderColor(HSSFColor.BLACK.index);
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);
    return style;
  }

  private HSSFCellStyle getCaptionStyle(HSSFWorkbook workbook, short fh) {
    HSSFFont font = workbook.createFont();
    font.setColor(HSSFColor.BLACK.index);
    font.setFontHeightInPoints((short) 12);// 设置字体大小
    font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
    font.setBold(true);
    font.setFontName("宋体");
    font.setFontHeight(fh);

    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
    style.setWrapText(true);
    // 设置边框
    style.setBottomBorderColor(HSSFColor.BLACK.index);
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);
    return style;
  }

  private HSSFCellStyle getTitleStyle(HSSFWorkbook workbook, short fh) {
    HSSFFont font = workbook.createFont();
    font.setColor(HSSFColor.BLACK.index);
    font.setBold(true);
    font.setFontName("宋体");
    font.setFontHeight(fh);
    font.setFontHeightInPoints((short) 18);// 设置字体大小

    HSSFCellStyle style = workbook.createCellStyle();
    style.setFont(font);
    style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

    style.setWrapText(true);
    // 设置边框
    style.setBottomBorderColor(HSSFColor.BLACK.index);
    style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
    style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    style.setBorderRight(HSSFCellStyle.BORDER_THIN);
    style.setBorderTop(HSSFCellStyle.BORDER_THIN);
    return style;
  }

  /**
   * 导出成竖向的结构|||,构造函数请选择ExcelTool(List<Caption> captions, List 有对图片的特殊处理 <DataColumn> colResults,
   * String titile)
   *
   * @author yuliangsong 2017年9月18日
   */
  public void exportVerticalStyle(HttpServletRequest request, HttpServletResponse response,
      String fileName) {
    init(response, fileName);
    if (colResults == null) {
      return;
    }

    String destPath = request.getRealPath(TPL_PATH);
    ServletOutputStream fOut = null;
    HSSFWorkbook workbook = null;
    try {
      workbook = new HSSFWorkbook(new FileInputStream(destPath));
      HSSFSheet sheet = workbook.getSheetAt(0);

      HSSFCellStyle centerStyle = getCenterStyle(workbook, (short) 240);
      HSSFCellStyle numberStyle = getRightStyle(workbook, (short) 240);
      HSSFCellStyle charStyle = getLeftStyle(workbook, (short) 240);
      HSSFCellStyle titleStyle = getTitleStyle(workbook, (short) 60);

      int rowIndex = 2;
      HSSFCell cell;
      HSSFRow row;

      row = sheet.createRow((short) 1);
      row.setHeight((short) 700);
      sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, colResults.size()));
      cell = row.createCell(0);
      cell.setCellStyle(titleStyle);
      sheet.getRow((short) 1).getCell(0).setCellValue(fileName);
      // 头部中文
      // 创建行
      row = sheet.createRow((short) rowIndex);
      row.setHeight((short) 850);
      int sheetPicNum = 1;
      // 先创建列
      for (int i = 0; i < captions.size(); i++) {
        Caption cap = captions.get(i);
        row = sheet.createRow((short) rowIndex);
        rowIndex++;
        row.setHeight((short) 800);
        sheet.setColumnWidth(i, 5000);

        // 是否是图片组的URL
        boolean isPics = false;
        cell = row.createCell(0);
        cell.setCellStyle(centerStyle);
        cell.setCellValue(captions.get(i).getName());
        HSSFPatriarch patriarch = null;
        if (Caption.IMAGE.equals(cap.getDataType())) {
          HSSFSheet picSheet = workbook.getSheetAt(sheetPicNum);
          workbook.setSheetName(sheetPicNum, cap.getName());
          sheetPicNum++;
          patriarch = picSheet.createDrawingPatriarch();
          isPics = true;
        }
        for (int j = 0; j < colResults.size(); j++) {
          DataColumn dCol = colResults.get(j);
          String property = cap.getProperty();
          sheet.setColumnWidth(j + 1, dCol.getColWidth());
          cell = row.createCell(j + 1);
          if (cap.getAlign() == Caption.ALIGN_LEFT) {
            cell.setCellStyle(charStyle);
          } else if (cap.getAlign() == Caption.ALIGN_RIGHT) {
            cell.setCellStyle(numberStyle);
          } else if (cap.getAlign() == Caption.ALIGN_CENTER) {
            cell.setCellStyle(centerStyle);
          }
          if (dCol.getValue(property) == null) {
            if (cap.getType() == Caption.TYPE_STRING) {
              cell.setCellValue("");
            } else {
              cell.setCellValue(0);
            }
          } else {
            if (cap.getType() == Caption.TYPE_STRING) {
              if (isPics) {
                String[] pics = dCol.getString(property).split(",");
                int picNum = 0;
                for (String picUrl : pics) {
                  BufferedImage bi = ImageIO.read(new URL(picUrl));
                  ByteArrayOutputStream outb = new ByteArrayOutputStream();
                  ImageIO.write(bi, "jpg", outb);
                  HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 0, picNum * 20,
                      (short) 11, (picNum + 1) * 20);

                  patriarch.createPicture(anchor,
                      workbook.addPicture(outb.toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                  picNum++;

                }
              }
              cell.setCellValue(dCol.getString(property));
            } else if (cap.getType() == Caption.TYPE_INT) {
              cell.setCellValue(dCol.getInt(property));
            } else if (cap.getType() == Caption.TYPE_DOUBLE) {
              cell.setCellValue(dCol.getDouble(property));
            }
          }
        }
      }

      fOut = response.getOutputStream();
      workbook.write(fOut);
      fOut.flush();
    } catch (IOException e) {
      logger.error("数据处理异常", e);
    } finally {
      if (fOut != null) {
        try {
          fOut.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
      if (null != workbook) {
        try {
          workbook.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
    }

  }

  /**
   * 图片导出测试
   *
   * @author yuliangsong 2017年9月21日
   */
  private InputStream getPic(String url) throws MalformedURLException, IOException {
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setReadTimeout(5000);
    conn.setConnectTimeout(5000);
    conn.setRequestMethod("GET");

    if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      InputStream inputStream = conn.getInputStream();
      return inputStream;
    } else {
      return null;
    }
  }

  /**
   * 列式导出时在别一页再列表. <br/>
   *
   * @since JDK 1.6
   */
  public void exportVerticalStyleAndList(HttpServletRequest request, HttpServletResponse response,
      String fileName) {
    init(response, fileName);
    if (colResults == null) {
      return;
    }

    String destPath = request.getRealPath(TPL_PATH);
    ServletOutputStream fOut = null;
    HSSFWorkbook workbook = null;
    try {
      workbook = new HSSFWorkbook(new FileInputStream(destPath));
      HSSFSheet sheet = workbook.getSheetAt(0);

      HSSFCellStyle centerStyle = getCenterStyle(workbook, (short) 240);
      HSSFCellStyle numberStyle = getRightStyle(workbook, (short) 240);
      HSSFCellStyle charStyle = getLeftStyle(workbook, (short) 240);
      HSSFCellStyle titleStyle = getTitleStyle(workbook, (short) 60);

      int rowIndex = 2;
      HSSFCell cell;
      HSSFRow row;

      row = sheet.createRow((short) 1);
      row.setHeight((short) 700);
      sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, colResults.size()));
      cell = row.createCell(0);
      cell.setCellStyle(titleStyle);
      sheet.getRow((short) 1).getCell(0).setCellValue(fileName);
      // 头部中文
      // 创建行
      row = sheet.createRow((short) rowIndex);
      row.setHeight((short) 850);

      // 先创建列
      for (int i = 0; i < captions.size(); i++) {
        Caption cap = captions.get(i);
        row = sheet.createRow((short) rowIndex);
        rowIndex++;
        row.setHeight((short) 800);
        sheet.setColumnWidth(i, 5000);
        // 是否是图片组的URL
        cell = row.createCell(0);
        cell.setCellStyle(centerStyle);
        cell.setCellValue(captions.get(i).getName());

        for (int j = 0; j < colResults.size(); j++) {
          DataColumn dCol = colResults.get(j);
          String property = cap.getProperty();
          sheet.setColumnWidth(j + 1, dCol.getColWidth());
          cell = row.createCell(j + 1);
          if (cap.getAlign() == Caption.ALIGN_LEFT) {
            cell.setCellStyle(charStyle);
          } else if (cap.getAlign() == Caption.ALIGN_RIGHT) {
            cell.setCellStyle(numberStyle);
          } else if (cap.getAlign() == Caption.ALIGN_CENTER) {
            cell.setCellStyle(centerStyle);
          }
          if (dCol.getValue(property) == null) {
            if (cap.getType() == Caption.TYPE_STRING) {
              cell.setCellValue("");
            } else {
              cell.setCellValue(0);
            }
          } else {
            if (cap.getType() == Caption.TYPE_STRING) {
              cell.setCellValue(dCol.getString(property));
            } else if (cap.getType() == Caption.TYPE_INT) {
              cell.setCellValue(dCol.getInt(property));
            } else if (cap.getType() == Caption.TYPE_DOUBLE) {
              cell.setCellValue(dCol.getDouble(property));
            }
          }
        }
      }
      if (otherResults != null && otherResults.size() > 0) {
        // ----------------------------------
        HSSFSheet sheet1 = workbook.getSheetAt(1);
        workbook.setSheetName(1, "参加学习人员列表");
        HSSFCellStyle captionStyle1 = getCaptionStyle(workbook, (short) 240);
        HSSFCellStyle centerStyle1 = getCenterStyle(workbook, (short) 240);
        HSSFCellStyle numberStyle1 = getRightStyle(workbook, (short) 240);
        HSSFCellStyle charStyle1 = getLeftStyle(workbook, (short) 240);
        HSSFCellStyle titleStyle1 = getTitleStyle(workbook, (short) 60);
        int rowIndex1 = 2, cellIndex = 0;
        HSSFCell cell1;
        HSSFRow row1;

        row1 = sheet1.createRow((short) 1);
        row1.setHeight((short) 700);
        sheet1.addMergedRegion(new CellRangeAddress(1, 1, 0, captions.size()));
        cell1 = row1.createCell(0);
        cell1.setCellStyle(titleStyle1);
        sheet1.getRow((short) 1).getCell(0).setCellValue(fileName);
        // 头部中文
        // 创建行
        row1 = sheet1.createRow((short) rowIndex1);
        rowIndex1++;
        row1.setHeight((short) 850);
        cell1 = row1.createCell(cellIndex);
        cell1.setCellStyle(captionStyle1);
        cell1.setCellValue("序号");
        cellIndex++;
        // 创建行
        for (int i = 0; i < captionsSec.size(); i++) {
          cell1 = row1.createCell(cellIndex);
          cell1.setCellStyle(centerStyle1);
          Caption cap = captionsSec.get(i);
          sheet1.setColumnWidth(i + 1, cap.getWidth());
          cell1.setCellValue(cap.getName());
          cellIndex++;
        }
        for (int j = 0; j < otherResults.size(); j++) {
          DataRow dRow = otherResults.get(j);
          row1 = sheet1.createRow((short) rowIndex1);
          rowIndex1++;
          row.setHeight((short) 600);
          cellIndex = 0;
          cell1 = row1.createCell(cellIndex);
          cell1.setCellStyle(centerStyle1);
          cell1.setCellValue(j + 1);
          cellIndex++;

          for (int i = 0; i < captionsSec.size(); i++) {
            Caption cap = captionsSec.get(i);
            String property = cap.getProperty();

            cell1 = row1.createCell(cellIndex);
            if (cap.getAlign() == Caption.ALIGN_LEFT) {
              cell1.setCellStyle(charStyle1);
            } else if (cap.getAlign() == Caption.ALIGN_RIGHT) {
              cell1.setCellStyle(numberStyle1);
            } else if (cap.getAlign() == Caption.ALIGN_CENTER) {
              cell1.setCellStyle(centerStyle1);
            }
            if (dRow.loadValue(property) == null) {
              if (cap.getType() == Caption.TYPE_STRING) {
                cell1.setCellValue("");
              } else {
                cell1.setCellValue(0);
              }
            } else {
              if (cap.getType() == Caption.TYPE_STRING) {
                cell1.setCellValue(dRow.loadStringValue(property));
              } else if (cap.getType() == Caption.TYPE_INT) {
                cell1.setCellValue(dRow.loadIntValue(property));
              } else if (cap.getType() == Caption.TYPE_DOUBLE) {
                cell1.setCellValue(dRow.loadDoubleValue(property));
              }
            }
            cellIndex++;
          }
        }
      }
      fOut = response.getOutputStream();
      workbook.write(fOut);
      fOut.flush();
    } catch (IOException e) {
      logger.error("数据处理异常", e);
    } finally {
      if (fOut != null) {
        try {
          fOut.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
      if (null != workbook) {
        try {
          workbook.close();
        } catch (IOException e) {
          logger.error("关闭io流异常", e);
        }
      }
    }
  }
}
