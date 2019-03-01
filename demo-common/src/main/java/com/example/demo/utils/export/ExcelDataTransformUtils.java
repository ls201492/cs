package com.example.demo.utils.export;

import com.example.demo.constant.SystemConstants;
import com.example.demo.export.WordDataColumn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelDataTransformUtils {

  private static final Logger Log = LoggerFactory.getLogger(ExcelDataTransformUtils.class);

  /*public static List<WordDataColumn> exportUserDetail(
      UserView datas) {

    Map<String, WordDataColumn> cache = new HashMap<>();
    if (null != datas) {
      WordDataColumn page = new WordDataColumn();
      page.getDatas().put("realname", datas.getRealname());
      page.getDatas().put("usedname", datas.getUserDetailExtInfo().getUsedName());
      page.getDatas().put("idCard", datas.getIdCard());
      page.getDatas().put("unit", datas.getUserDetailExtInfo().getUnit());

      page.getDatas()
          .put("gender", getGender(datas));
      page.getDatas().put("nationalName", datas.getUserDetailExtInfo().getNationalName());
      page.getDatas().put("birthDay", IdCardUtil.getBirthday(datas.getIdCard()));
      page.getDatas()
          .put("educationLevelName", datas.getUserDetailExtInfo().getEducationLevelName());
      page.getDatas().put("healthDesc", datas.getUserDetailExtInfo().getHealthDesc());
      page.getDatas().put("politicalName", datas.getUserDetailExtInfo().getPoliticalName());
      page.getDatas().put("maritalName", datas.getUserDetailExtInfo().getMaritalName());
      page.getDatas().put("mainCriminalFact", datas.getUserDetailExtInfo().getMainCriminalFact());
      page.getDatas().put("criminalHistory", datas.getUserDetailExtInfo().getCriminalHistory());
      page.getDatas().put("address", datas.getAddress());
      page.getDatas()
          .put("registrationAddress", datas.getUserDetailExtInfo().getRegistrationAddress());
      page.getDatas().put("unitContact", datas.getUserDetailExtInfo().getUnitContact());
      page.getDatas().put("mobile", datas.getMobile());
      page.getDatas().put("criminalTypeName", datas.getCriminalTypeName());
      page.getDatas()
          .put("criminalParentTypeName", datas.getUserDetailExtInfo().getQuickSearchName());
      page.getDatas().put("sentencings", getTime(datas.getUserDetailExtInfo().getSentencing()));
      page.getDatas().put("communityCorrectDecisionUnit",
          datas.getUserDetailExtInfo().getCommunityCorrectDecisionUnit());
      page.getDatas().put("detentionPlace", datas.getUserDetailExtInfo().getDetentionPlace());
      page.getDatas().put("prohibitedContent", datas.getUserDetailExtInfo().getProhibitedContent());
      page.getDatas().put("rectifyTime",
          IdCardUtil.getDayBetween(datas.getRectifyStart(), datas.getRectifyEnd()) + "天");

      page.getDatas()
          .put("prohibitedContentPeriod", prohibitedContentTime(datas.getUserDetailExtInfo()));
      page.getDatas().put("rectifyLevelName", datas.getUserDetailExtInfo().getRectifyTypeName());
      page.getDatas().put("rectifyPeriod", timeVal(datas.getRectifyStart(), datas.getRectifyEnd()));
      page.getDatas().put("legalDocumentTypeAndTime",
          datas.getUserDetailExtInfo().getLegalDocumentTypeAndTime());
      page.getDatas()
          .put("receivingModeAndCheckinTime",
              datas.getUserDetailExtInfo().getReceivingModeAndCheckinTime());
      page.getDatas()
          .put("socialSituation",
              datas.getUserDetailExtInfo().getSocialSituation());
      page.getDatas()
          .put("createTime", DateUtil.getDateToYearMonthDay(SystemConstants.YEAR_TIME_LABLE_FORMAT));
      page.getDatas()
          .put("bureauName", datas.getBureauName());
      if (datas.getUserDetailExtInfo().getCheckinStatus() != null) {
        switch (datas.getUserDetailExtInfo().getCheckinStatus()) {
          case 1:
            page.getDatas()
                .put("isReport", "√");
            break;
          case 2:
            page.getDatas()
                .put("exceedTimeReport", "√");
            break;
          case 3:
            page.getDatas()
                .put("notReport", "√");
            break;
        }
      }

      List<Map<String, String>> jiatins = new ArrayList<>();
      page.getDatas().put("jiating", jiatins);
      Map<String, String> jiating1 = new HashMap<>();
      for (XaUserDetailFamilyMembers familyMembers : datas.getUserDetailFamilyMembers()
      ) {
        jiating1 = new HashMap<>();
        jiating1.put("name", familyMembers.getName());
        jiating1.put("filiation", familyMembers.getFiliation());
        jiating1.put("workOrFamilyAddress", familyMembers.getWorkOrFamilyAddress());
        jiating1.put("phone", familyMembers.getContact());
        jiatins.add(jiating1);
      }
      if (CollectionUtils.isEmpty(jiatins)) {
        jiating1 = new HashMap<>();
        jiating1.put("name", "");
        jiating1.put("filiation", "");
        jiating1.put("workOrFamilyAddress", "");
        jiating1.put("phone", "");
        jiatins.add(jiating1);
      }
      List<Map<String, String>> jianlis = new ArrayList<>();
      page.getDatas().put("jianli", jianlis);
      Map<String, String> jianli1 = new HashMap<>();
      for (XaUserDetailTrackRecord trackRecord : datas.getUserDetailTrackRecords()
      ) {
        jianli1 = new HashMap<>();
        jianli1.put("beginTime", timeVal(trackRecord.getBeginTime(), trackRecord.getEndTime()));
        jianli1.put("workName", trackRecord.getUnit());
        jianli1.put("job", trackRecord.getJob());
        jianlis.add(jianli1);
      }
      if (CollectionUtils.isEmpty(jianli1)) {
        jianli1 = new HashMap<>();
        jianli1.put("beginTime", "");
        jianli1.put("workName", "");
        jianli1.put("job", "");
        jianlis.add(jianli1);
      }
      cache.put(datas.getId().toString(), page);
    }
    return cache.values().stream().collect(Collectors.toList());
  }

  private static String prohibitedContentTime(UserDetailExtInfo userDetailExtInfo) {
    if (userDetailExtInfo == null) {
      return "";
    }
    return timeVal(userDetailExtInfo.getProhibitedContentStartTime(), userDetailExtInfo.getProhibitedContentEndTime());
  }

  private static String timeVal(String start, String end){
    String result = "";
    if (!StringUtils.isEmpty(start)) {
      result += start;
    }

    if (!StringUtils.isEmpty(end)) {
      result += (" 至 " + end);
    }
    return result;
  }

  public static String getTime(Integer date) {
    StringBuilder time = new StringBuilder();
    if (date != null) {
      time.append(date / 12).append("年")
          .append(date % 12).append("月");
    }
    return time.toString();
  }

  private static String getGender(UserView datas) {
    return datas.getGender() != null && datas.getGender() == 0 ? "女" : "男";
  }
*/
}
