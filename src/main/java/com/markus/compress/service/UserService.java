package com.markus.compress.service;

import com.markus.compress.domain.Department;
import com.markus.compress.domain.Position;
import com.markus.compress.domain.User;

import java.util.*;

/**
 * @author: markus
 * @date: 2022/5/11 12:16 下午
 * @Description: 用户服务
 * @Blog: http://markuszhang.com/
 */
public class UserService {

    public List<User> getList(int count) {
        List<User> list = new ArrayList<User>(count);
        for (int i = 0; i < count; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString().replace("-", ""));
            user.setAccount("account" + i);
            user.setPassword("password" + i);
            user.setStatus(1);
            user.setName("markus" + i);
            user.setNo("No." + i);
            user.setSex("male");
            user.setBirthday(new Date());
            user.setMobile("12345678912");
            user.setInnerTel("****-123456");
            user.setOuterTel("****-123456");
            user.setWeixin("powerfulzzs" + i);
            user.setWeixinQrcode("zzs/" + i + ".jpg");
            user.setFax("fax" + i);
            user.setQq("1769464444" + i);
            user.setEmail(user.getQq() + "@qq.com");
            user.setPicture("zzs2/" + i + ".jpg");
            user.setType("king");
            user.setAddress("address" + i);
            user.setLeaved(0);
            user.setJoinDate(new Date());
            user.setIdCard("433556462" + i);
            user.setDiploma(0);
            user.setMaritalStatus(1);
            user.setAge(18);
            user.setJob("king");
            user.setPermanentAddress("北京");
            user.setLoginDate(new Date());
            user.setPinyin("zzs" + i);

            user.setField00("field00" + UUID.randomUUID().toString().replace("-", ""));
            user.setField01("field01" + UUID.randomUUID().toString().replace("-", ""));
            user.setField02("field02" + UUID.randomUUID().toString().replace("-", ""));
            user.setField03("field03" + UUID.randomUUID().toString().replace("-", ""));
            user.setField04("field04" + UUID.randomUUID().toString().replace("-", ""));
            user.setField05("field05" + UUID.randomUUID().toString().replace("-", ""));
            user.setField06("field06" + UUID.randomUUID().toString().replace("-", ""));
            user.setField07("field07" + UUID.randomUUID().toString().replace("-", ""));
            user.setField08("field08" + UUID.randomUUID().toString().replace("-", ""));
            user.setField09("field09" + UUID.randomUUID().toString().replace("-", ""));
            user.setField10("field10" + UUID.randomUUID().toString().replace("-", ""));
            user.setField11("field11" + UUID.randomUUID().toString().replace("-", ""));
            user.setField12("field12" + UUID.randomUUID().toString().replace("-", ""));
            user.setField13("field13" + UUID.randomUUID().toString().replace("-", ""));
            user.setField14("field14" + UUID.randomUUID().toString().replace("-", ""));
            user.setField15("field15" + UUID.randomUUID().toString().replace("-", ""));
            user.setField16("field16" + UUID.randomUUID().toString().replace("-", ""));
            user.setField17("field17" + UUID.randomUUID().toString().replace("-", ""));
            user.setField18("field18" + UUID.randomUUID().toString().replace("-", ""));
            user.setField19("field19" + UUID.randomUUID().toString().replace("-", ""));
            user.setField20("field20" + UUID.randomUUID().toString().replace("-", ""));
            user.setField21("field21" + UUID.randomUUID().toString().replace("-", ""));
            user.setField22("field22" + UUID.randomUUID().toString().replace("-", ""));
            user.setField23("field23" + UUID.randomUUID().toString().replace("-", ""));
            user.setField24("field24" + UUID.randomUUID().toString().replace("-", ""));
            user.setField25("field25" + UUID.randomUUID().toString().replace("-", ""));
            user.setField26("field26" + UUID.randomUUID().toString().replace("-", ""));
            user.setField27("field27" + UUID.randomUUID().toString().replace("-", ""));
            user.setField28("field28" + UUID.randomUUID().toString().replace("-", ""));
            user.setField29("field29" + UUID.randomUUID().toString().replace("-", ""));
            user.setField30("field30" + UUID.randomUUID().toString().replace("-", ""));
            user.setField31("field31" + UUID.randomUUID().toString().replace("-", ""));
            user.setField32("field32" + UUID.randomUUID().toString().replace("-", ""));
            user.setField33("field33" + UUID.randomUUID().toString().replace("-", ""));
            user.setField34("field34" + UUID.randomUUID().toString().replace("-", ""));
            user.setField35("field35" + UUID.randomUUID().toString().replace("-", ""));
            user.setField36("field36" + UUID.randomUUID().toString().replace("-", ""));
            user.setField37("field37" + UUID.randomUUID().toString().replace("-", ""));
            user.setField38("field38" + UUID.randomUUID().toString().replace("-", ""));
            user.setField39("field39" + UUID.randomUUID().toString().replace("-", ""));
            user.setField40("field40" + UUID.randomUUID().toString().replace("-", ""));
            user.setField41("field41" + UUID.randomUUID().toString().replace("-", ""));
            user.setField42("field42" + UUID.randomUUID().toString().replace("-", ""));
            user.setField43("field43" + UUID.randomUUID().toString().replace("-", ""));
            user.setField44("field44" + UUID.randomUUID().toString().replace("-", ""));
            user.setField45("field45" + UUID.randomUUID().toString().replace("-", ""));
            user.setField46("field46" + UUID.randomUUID().toString().replace("-", ""));
            user.setField47("field47" + UUID.randomUUID().toString().replace("-", ""));
            user.setField48("field48" + UUID.randomUUID().toString().replace("-", ""));
            user.setField49("field49" + UUID.randomUUID().toString().replace("-", ""));
            user.setField50("field50" + UUID.randomUUID().toString().replace("-", ""));
            user.setField51("field51" + UUID.randomUUID().toString().replace("-", ""));
            user.setField52("field52" + UUID.randomUUID().toString().replace("-", ""));
            user.setField53("field53" + UUID.randomUUID().toString().replace("-", ""));
            user.setField54("field54" + UUID.randomUUID().toString().replace("-", ""));
            user.setField55("field55" + UUID.randomUUID().toString().replace("-", ""));
            user.setField56("field56" + UUID.randomUUID().toString().replace("-", ""));
            user.setField57("field57" + UUID.randomUUID().toString().replace("-", ""));
            user.setField58("field58" + UUID.randomUUID().toString().replace("-", ""));
            user.setField59("field59" + UUID.randomUUID().toString().replace("-", ""));
            user.setField60("field60" + UUID.randomUUID().toString().replace("-", ""));
            user.setField61("field61" + UUID.randomUUID().toString().replace("-", ""));
            user.setField62("field62" + UUID.randomUUID().toString().replace("-", ""));
            user.setField63("field63" + UUID.randomUUID().toString().replace("-", ""));
            user.setField64("field64" + UUID.randomUUID().toString().replace("-", ""));
            user.setField65("field65" + UUID.randomUUID().toString().replace("-", ""));
            user.setField66("field66" + UUID.randomUUID().toString().replace("-", ""));
            user.setField67("field67" + UUID.randomUUID().toString().replace("-", ""));
            user.setField68("field68" + UUID.randomUUID().toString().replace("-", ""));
            user.setField69("field69" + UUID.randomUUID().toString().replace("-", ""));
            user.setField70("field70" + UUID.randomUUID().toString().replace("-", ""));
            user.setField71("field71" + UUID.randomUUID().toString().replace("-", ""));
            user.setField72("field72");
            user.setField73("field73");
            user.setField74("field74");
            user.setField75("field75");
            user.setField76("field76");
            user.setField77("field77");
            user.setField78("field78");
            user.setField79("field79");
            user.setField80("field80");
            user.setField81("field81");
            user.setField82("field82");
            user.setField83("field83");
            user.setField84("field84");
            user.setField85("field85");
            user.setField86("field86");
            user.setField87("field87");
            user.setField88("field88");
            user.setField89("field89");
            user.setField90("field90");
            user.setField91("field91");
            user.setField92("field92");
            user.setField93("field93");
            user.setField94("field94");
            user.setField95("field95");
            user.setField96("field96");
            user.setField97("field97");
            user.setField98("field98");
            user.setField99("field99");

            Position position = new Position();
            position.setId(UUID.randomUUID().toString().replace("-", ""));
            position.setName("King");
            position.setParentId("1");
            position.setNo("PNo.123456");
            position.setLevel(2);
            position.setOrderNo(0);
            user.setPosition(position);

            Department department = new Department();
            department.setId(UUID.randomUUID().toString().replace("-", ""));
            department.setName("软件研发部");
            department.setParentId("1");
            department.setNo("DNo.123456");
            department.setLevel(2);
            department.setAddress("北京");
            department.setOrderNo(0);
            Department department2 = new Department();
            department2.setId(UUID.randomUUID().toString().replace("-", ""));
            department2.setName("软件研发部");
            department2.setParentId(department.getId());
            department2.setNo("DNo.123457");
            department2.setLevel(2);
            department2.setAddress("北京");
            department2.setOrderNo(0);
            department.setChildren(Arrays.asList(department2));
            user.setDepartment(department);

            list.add(user);
        }
        return list;
    }

    public User get() {
        return getList(1).get(0);
    }

}
