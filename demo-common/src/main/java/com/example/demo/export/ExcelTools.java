package com.example.demo.export;

import java.util.Collection;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelTools {

  private static final Logger logger = LoggerFactory.getLogger(ExcelTools.class);

  /**
   * @Description Excel名称管理（用于数据有效性设置下拉列表）
   */
  public static void creatExcelNameList(Workbook workbook, String sheetName, String nameCode,
      int order, int size, boolean cascadeFlag) {
    Name name = workbook.createName();
    name.setNameName(nameCode);
    String formula = sheetName + "!" + creatExcelNameList(order, size, cascadeFlag);
    name.setRefersToFormula(formula);
  }

  /**
   * @Description Excel名称管理（用于数据有效性设置下拉列表）
   */
  public static String creatExcelNameList(int order, int size, boolean cascadeFlag) {
    char start = 'A';
    if (cascadeFlag) {
      if (size <= 25) {
        char end = (char) (start + size - 1);
        return "$" + start + "$" + order + ":$" + end + "$" + order;
      } else {
        char endPrefix = 'A';
        char endSuffix = 'A';
        if ((size - 25) / 26 == 0 || size == 51) {// 26-51之间，包括边界（仅两次字母表计算）
          if ((size - 25) % 26 == 0) {// 边界值
            endSuffix = (char) ('A' + 25);
          } else {
            endSuffix = (char) ('A' + (size - 25) % 26 - 1);
          }
        } else {// 51以上
          if ((size - 25) % 26 == 0) {
            endSuffix = (char) ('A' + 25);
            endPrefix = (char) (endPrefix + (size - 25) / 26 - 1);
          } else {
            endSuffix = (char) ('A' + (size - 25) % 26 - 1);
            endPrefix = (char) (endPrefix + (size - 25) / 26);
          }
        }
        return "$" + start + "$" + order + ":$" + endPrefix + endSuffix + "$" + order;
      }
    } else {
      if (size <= 26) {
        char end = (char) (start + size - 1);
        return "$" + start + "$" + order + ":$" + end + "$" + order;
      } else {
        char endPrefix = 'A';
        char endSuffix = 'A';
        if (size % 26 == 0) {
          endSuffix = (char) ('A' + 25);
          if (size > 52 && size / 26 > 0) {
            endPrefix = (char) (endPrefix + size / 26 - 2);
          }
        } else {
          endSuffix = (char) ('A' + size % 26 - 1);
          if (size > 52 && size / 26 > 0) {
            endPrefix = (char) (endPrefix + size / 26 - 1);
          }
        }
        return "$" + start + "$" + order + ":$" + endPrefix + endSuffix + "$" + order;
      }
    }
  }

  /**
   * @Description 创建Excel行内容
   */
  public static void creatRow(Row currentRow, Collection<String> textList) {
    if (textList != null && textList.size() > 0) {
      int i = 0;
      for (String cellValue : textList) {
        Cell userNameLableCell = currentRow.createCell(i++);
        userNameLableCell.setCellValue(cellValue);
      }
    }
  }

  /**
   * @Description 设置数据有效性
   */
  public static DataValidation getDataValidationByFormula(String formulaString, int naturalRowIndex,
      int naturalColumnIndex) {
    // 加载下拉列表内容
    DVConstraint constraint = DVConstraint.createFormulaListConstraint(formulaString);

    // 设置数据有效性加载在哪个单元格上。
    // 四个参数分别是：起始行、终止行、起始列、终止列
    int firstRow = naturalRowIndex - 1;
    int lastRow = naturalRowIndex - 1;
    int firstCol = naturalColumnIndex - 1;
    int lastCol = naturalColumnIndex - 1;
    CellRangeAddressList regions = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
    // 数据有效性对象
    DataValidation data_validation_list = new HSSFDataValidation(regions, constraint);
    data_validation_list.setEmptyCellAllowed(false);
    if (data_validation_list instanceof XSSFDataValidation) {
      data_validation_list.setSuppressDropDownArrow(true);
      data_validation_list.setShowErrorBox(true);
    } else {
      data_validation_list.setSuppressDropDownArrow(false);
    }
    // 设置输入信息提示信息
    data_validation_list.createPromptBox("下拉选择提示", "请使用下拉方式选择合适的值！");
    // 设置输入错误提示信息
    data_validation_list.createErrorBox("选择错误提示", "你输入的值未在备选列表中，请下拉选择合适的值！");
    return data_validation_list;
  }
}
