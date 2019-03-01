package com.example.demo.export;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

public class WordTools {

  private static final Logger logger = LoggerFactory.getLogger(WordTools.class);
  public static Pattern p = Pattern.compile(".*?(\\$\\{(.*?)\\}).*?");
  public static String NEXT_TABLE_LINE_LOOP_FLAG = "LOOP_BEGIN_ROW";

  public static void main(String[] args) throws Exception {

    Map<String, Object> parma = new HashMap<>();
    parma.put("reportTypeName", "周汇报");
    parma.put("name", "李想");
    parma.put("rectifyLevelName", "宽管");
    parma.put("rectifyStartDate", "2018年9月18日");
    parma.put("rectifyEndDate", "2020年9月18日");

    List<Map<String, String>> reportDataMap = new ArrayList<>();
    parma.put("reports", reportDataMap);


    Map<String, String> row1 = new HashMap<>();
    reportDataMap.add(row1);
    row1.put("reportDate", "2018年10月26日");
    row1.put("reportContent", "周汇报第一行");

    Map<String, String> row2 = new HashMap<>();
    reportDataMap.add(row2);
    row2.put("reportDate", "2018年10月29日");
    row2.put("reportContent", "周汇报第二行");

    Map<String, String> row3 = new HashMap<>();
    reportDataMap.add(row3);
    row3.put("reportDate", "2018年10月30日");
    row3.put("reportContent", "周汇报第三行");

    Map<String, String> row4 = new HashMap<>();
    reportDataMap.add(row4);
    row4.put("reportDate", "2018年11月2日");
    row4.put("reportContent", "周汇报第四行");

    String path = "/Users/mac/Documents/Work/zhanyaa/xinan/codes/XinAn-Admin/src/main/webapp/res/report-export-template/ah-wh.docx";

    List<XWPFDocument> documents = new ArrayList<>();
    documents.add(generateWord(parma, path));

    parma.put("name", "李天一");
    parma.put("reportContent", "周汇报---");

    row1.put("reportDate", "2018年10月23日");
    row1.put("reportContent", "周汇报第1行");

    row2.put("reportDate", "2018年10月27日");
    row2.put("reportContent", "周汇报第2行");

    row3.put("reportDate", "2018年10月29日");
    row3.put("reportContent", "周汇报第3行");

    row4.put("reportDate", "2018年11月3日");
    row4.put("reportContent", "周汇报第4行");
    XWPFDocument word1 = generateWord(parma, path);
    documents.add(word1);

    XWPFDocument word = appendAllDocmentToOne(documents);
    FileOutputStream fos = new FileOutputStream(
            "/Users/mac/Documents/Work/zhanyaa/xinan/codes/XinAn-Admin/gen-2.docx");
    word.write(fos);


  }

  public static void main1(String[] args) throws Exception {

    Map<String, Object> params = new HashMap<>();
    params.put("name", "周二同学");
    params.put("usedname", "二哈");
    params.put("idCard", "312312199012100011");
    params.put("gender", "男");
    params.put("national", "奇葩族");
    params.put("birthDay", "1990年12月10日");
    params.put("educationLevel", "文盲");
    params.put("healthDesc", "正常");
    params.put("political", "党员");
    params.put("marital", "未婚");
    params.put("mainCriminalFact", "抢幼儿园小朋友的棒棒糖");
    params.put("mainCriminalFact1", "抢劫后逃逸");
    params.put("criminalHistory", "骗取幼儿园小朋友的零食");

    List<Map<String, String>> jianlis = new ArrayList<>();
    params.put("jianli", jianlis);
    Map<String, String> jianli1 = new HashMap<>();
    jianli1.put("beginTime", "2018-01");
    jianli1.put("endTime", "2018-02");
    jianli1.put("unit ", "利尔达科技");
    jianli1.put("job", "前台");
    Map<String, String> jianli2 = new HashMap<>();
    jianli2.put("beginTime", "2018-03");
    jianli2.put("endTime", "2018-04");
    jianli2.put("unit ", "利尔达科技");
    jianli2.put("job", "客服主管");
    Map<String, String> jianli3 = new HashMap<>();
    jianli3.put("beginTime", "2018-05");
    jianli3.put("endTime", "2018-06");
    jianli3.put("unit ", "利尔达科技");
    jianli3.put("job", "经理秘书");
    Map<String, String> jianli4 = new HashMap<>();
    jianli4.put("beginTime", "2018-07");
    jianli4.put("endTime", "2018-08");
    jianli4.put("unit ", "利尔达科技");
    jianli4.put("job", "董事助理");
    jianlis.add(jianli1);
    jianlis.add(jianli2);
    jianlis.add(jianli3);
    jianlis.add(jianli4);

    List<Map<String, String>> jiatins = new ArrayList<>();
    params.put("jiating", jiatins);
    Map<String, String> jiating1 = new HashMap<>();
    jiating1.put("name", "周末");
    jiating1.put("filiation", "哥哥");
    jiating1.put("workOrFamilyAddress", "西普斯林顿小学");
    jiating1.put("phone", "12598988989");
    Map<String, String> jiating2 = new HashMap<>();
    jiating2.put("name", "周星期");
    jiating2.put("filiation", "父亲");
    jiating2.put("workOrFamilyAddress", "家里蹲农业种植研究所试验农户");
    jiating2.put("phone", "13333112255");
    Map<String, String> jiating3 = new HashMap<>();
    jiating3.put("name", "贾翠花");
    jiating3.put("filiation", "母亲");
    jiating3.put("workOrFamilyAddress", "家里蹲农业种植研究所试验农户食堂");
    jiating3.put("phone", "13333112276");

    jiatins.add(jiating1);
    jiatins.add(jiating2);
    jiatins.add(jiating3);

    List<String> socialSituationList = new ArrayList<>();
    socialSituationList.add("李四-13311221011");
    socialSituationList.add("王五-13311221012");
    socialSituationList.add("张六-13311221013");
    params.put("socialSituation", socialSituationList);

    String path = "/Code/xinan/XinAn-Admin/src/main/webapp/res/report-export-template/ah-wh-user.docx";

    List<XWPFDocument> documents = new ArrayList<>();
    documents.add(generateWord(params, path));


    XWPFDocument word = appendAllDocmentToOne(documents);
    FileOutputStream fos = new FileOutputStream(
            "/Code/xinan/XinAn-Admin/src/main/webapp/res/report-export-template/ah-wh-userext.docx");
    word.write(fos);


  }


  public static XWPFDocument generateWord(Map<String, Object> params, String path) throws Exception {
    XWPFDocument doc = null;
    OPCPackage pack = POIXMLDocument.openPackage(path);
    doc = new XWPFDocument(pack);
    if (params != null && params.size() > 0) {

      //处理段落
      List<XWPFParagraph> paragraphList = doc.getParagraphs();
      prossessParagraphs(params, paragraphList);

      //处理表格
      Iterator<XWPFTable> it = doc.getTablesIterator();
      while (it.hasNext()) {
        XWPFTable table = it.next();
        String loopDataKey = null;
        XWPFTableRow row = null;
        for (int r = 0; r < table.getRows().size(); r++) {
          row = table.getRows().get(r);
          if (!StringUtils.isEmpty(loopDataKey)) {
            List<Map<String, Object>> loopDatas = (List<Map<String, Object>>) params.get(loopDataKey);
            if (!CollectionUtils.isEmpty(loopDatas)) {

              XWPFTableRow newRow = null;
              XWPFTableRow oldRow = row;
              int i = 0;
              for (Map<String, Object> loopDataMap : loopDatas) {

                if (i < loopDatas.size() - 1) {
                  newRow = table.insertNewTableRow(r + i + 1);
                  copyTableRow(newRow, oldRow);
                }
                i++;
                processRow(loopDataMap, oldRow);
                oldRow = newRow;

              }
              r = r + i;
            }
            loopDataKey = null;
          } else {
            List<String> allLabels = processRow(params, row);
            loopDataKey = getNextLineIsLoopLine(allLabels);
          }

        }
      }
    }
    return doc;
  }

  private static List<String> processRow(Map<String, Object> params, XWPFTableRow row) {
    List<String> allLabels = new ArrayList<>();
    for (XWPFTableCell cell : row.getTableCells()) {
      List<XWPFParagraph> paragraphListTable = cell.getParagraphs();
      List<String> labels = prossessParagraphs(params, paragraphListTable);
      if (!CollectionUtils.isEmpty(labels)) {
        allLabels.addAll(labels);
      }
    }
    return allLabels;
  }

  private static String getNextLineIsLoopLine(List<String> allLabels) {
    if (CollectionUtils.isEmpty(allLabels)) {
      return null;
    }
    for (String label : allLabels) {
      if (label.startsWith(NEXT_TABLE_LINE_LOOP_FLAG)) {
        return label.split("-")[1];
      }
    }
    return null;
  }


  /**
   * 处理段落
   */
  public static List<String> prossessParagraphs(Map<String, Object> params, List<XWPFParagraph> paragraphList) {
    List<String> labels = Lists.newArrayList();
    if (paragraphList != null && paragraphList.size() > 0) {
      for (XWPFParagraph paragraph : paragraphList) {
        String text = paragraph.getText();
        if (!StringUtils.isEmpty(text)) {

          Matcher m = p.matcher(text);
          if (m.find()) {
            String label = m.group(2).trim();
            if (!StringUtils.isEmpty(label)) {
              labels.add(label);
            }
            Object content = params.get(label);
            String value = "";
            if (null != content && content instanceof String) {
              value = (String) content;
            }
            text = text.replace(m.group(1), value);
          }
        }
        List<XWPFRun> runs = paragraph.getRuns();
        for (int r = 0; r < runs.size(); r++) {
          paragraph.removeRun(r--);
        }
        paragraph.createRun().setText(text, 0);
      }
    }
    if (!CollectionUtils.isEmpty(labels)) {
      List<String> otherLabels = prossessParagraphs(params, paragraphList);
      if (!CollectionUtils.isEmpty(otherLabels)) {
        labels.addAll(otherLabels);
      }
    }
    return labels;
  }


  /**
   * 复制表格行XWPFTableRow格式
   *
   * @param target 待修改格式的XWPFTableRow
   * @param source 模板XWPFTableRow
   */
  private static void copyTableRow(XWPFTableRow target, XWPFTableRow source) {

    int tempRowCellsize = source.getTableCells().size();// 模板行的列数
    for (int i = 0; i < tempRowCellsize; i++) {
      if (target.getTableCells().size() < tempRowCellsize) {
        target.addNewTableCell();// 为新添加的行添加与模板表格对应行行相同个数的单元格
      }
    }
    // 复制样式
    target.getCtRow().setTrPr(source.getCtRow().getTrPr());
    // 复制单元格
    for (int i = 0; i < target.getTableCells().size(); i++) {
      copyTableCell(target.getCell(i), source.getCell(i));
    }
  }


  /**
   * 复制单元格XWPFTableCell格式
   *
   * @param newTableCell      新创建的的单元格
   * @param templateTableCell 模板单元格
   */
  private static void copyTableCell(XWPFTableCell newTableCell, XWPFTableCell templateTableCell) {
    if (null == newTableCell || null == templateTableCell) {
      return;
    }
    // 列属性
    if (null != templateTableCell.getCTTc() && null != newTableCell.getCTTc()) {
      newTableCell.getCTTc().setTcPr(templateTableCell.getCTTc().getTcPr());
    }
    // 删除目标 targetCell 所有文本段落
    for (int pos = 0; pos < newTableCell.getParagraphs().size(); pos++) {
      newTableCell.removeParagraph(pos);
    }
    // 添加新文本段落
    for (XWPFParagraph sp : templateTableCell.getParagraphs()) {
      XWPFParagraph targetP = newTableCell.addParagraph();
      copyParagraph(targetP, sp);
    }
  }

  /**
   * 复制文本段落XWPFParagraph格式
   *
   * @param newParagraph      新创建的的段落
   * @param templateParagraph 模板段落
   */
  private static void copyParagraph(XWPFParagraph newParagraph, XWPFParagraph templateParagraph) {
    // 设置段落样式
    newParagraph.getCTP().setPPr(templateParagraph.getCTP().getPPr());
    // 添加Run标签
    for (int pos = 0; pos < newParagraph.getRuns().size(); pos++) {
      newParagraph.removeRun(pos);

    }
    for (XWPFRun s : templateParagraph.getRuns()) {
      XWPFRun targetrun = newParagraph.createRun();
      copyRun(targetrun, s);
    }

  }

  /**
   * 复制文本节点run
   *
   * @param newRun      新创建的的文本节点
   * @param templateRun 模板文本节点
   */
  private static void copyRun(XWPFRun newRun, XWPFRun templateRun) {
    newRun.getCTR().setRPr(templateRun.getCTR().getRPr());
    // 设置文本
    newRun.setText(templateRun.text());
  }

  private static void appendBody(CTBody src, CTBody append) throws Exception {
    XmlOptions optionsOuter = new XmlOptions();
    optionsOuter.setSaveOuter();
    String appendString = append.xmlText(optionsOuter);
    String srcString = src.xmlText();
    String prefix = srcString.substring(0, srcString.indexOf(">") + 1);
    String mainPart = srcString.substring(srcString.indexOf(">") + 1, srcString.lastIndexOf("<"));
    String sufix = srcString.substring(srcString.lastIndexOf("<"));
    String addPart = appendString
            .substring(appendString.indexOf(">") + 1, appendString.lastIndexOf("<"));
    CTBody makeBody = CTBody.Factory.parse(prefix + mainPart + addPart + sufix);
    src.set(makeBody);
  }

  public static XWPFDocument appendAllDocmentToOne(List<XWPFDocument> docs) throws Exception {
    XWPFDocument doc = null;
    if (!CollectionUtils.isEmpty(docs)) {
      doc = docs.get(0);
      for (int i = 1; i < docs.size(); i++) {
        if (i < docs.size()) {
          doc.createParagraph().setPageBreak(true);
        }
        appendBody(doc.getDocument().getBody(), docs.get(i).getDocument().getBody());
      }
    }
    return doc;
  }
  public static void exprotWord(List<WordDataColumn> docs, HttpServletResponse resp,
      String filePath, String fileName) {
    if (CollectionUtils.isEmpty(docs)) {
      return;
    }

    List<XWPFDocument> wordDocs = new ArrayList<>();
    for (WordDataColumn doc : docs) {
      try {
        //doc.getDatas().put("reports",doc.getTables());
        XWPFDocument w = generateWord(doc.getDatas(), filePath);
        if(null != w)
        {
          wordDocs.add(w);
        }
      } catch (Exception e) {
        logger.error("exprotWord error! param:"+ JSON.toJSONString(doc)+" ,filePath:"+filePath,e);
      }
    }
    try {
      XWPFDocument word = appendAllDocmentToOne(wordDocs);
      if(null != word)
      {
        String fullName = fileName + ".docx";
        resp.setCharacterEncoding("UTF-8");
        resp.reset();
        resp.setHeader("content-Type", "application/vnd.ms-word");
        try {
          resp.setHeader("Content-Disposition", "attachment; fileName=" + fullName
              + ";filename*=utf-8''" + URLEncoder.encode(fullName, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
          logger.error("response header error", e);
        }
        word.write(resp.getOutputStream());
      }
    } catch (Exception e) {
      logger.error("exprotWord error! filePath:"+filePath,e);
    }
  }

}
