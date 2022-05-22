package com.markus.compress.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: markus
 * @date: 2022/5/11 12:13 下午
 * @Description: 用户
 * @Blog: http://markuszhang.com/
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    // 普通属性
    private String id;
    private String account;
    private String password;
    private Integer status;
    private String name;
    private String no;
    private String sex;
    private Date birthday;
    private String mobile;
    private String innerTel;
    private String outerTel;
    private String weixin;
    private String weixinQrcode;
    private String fax;
    private String qq;
    private String email;
    private String picture;
    private String type;
    private String address;
    private Integer leaved;
    private Date joinDate;
    private String idCard;
    private Integer diploma;
    private Integer maritalStatus;
    private Integer age;
    private String job;
    private String permanentAddress;
    private Date loginDate;
    private String pinyin;

    private String field00;
    private String field01;
    private String field02;
    private String field03;
    private String field04;
    private String field05;
    private String field06;
    private String field07;
    private String field08;
    private String field09;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private String field16;
    private String field17;
    private String field18;
    private String field19;
    private String field20;
    private String field21;
    private String field22;
    private String field23;
    private String field24;
    private String field25;
    private String field26;
    private String field27;
    private String field28;
    private String field29;
    private String field30;
    private String field31;
    private String field32;
    private String field33;
    private String field34;
    private String field35;
    private String field36;
    private String field37;
    private String field38;
    private String field39;
    private String field40;
    private String field41;
    private String field42;
    private String field43;
    private String field44;
    private String field45;
    private String field46;
    private String field47;
    private String field48;
    private String field49;
    private String field50;
    private String field51;
    private String field52;
    private String field53;
    private String field54;
    private String field55;
    private String field56;
    private String field57;
    private String field58;
    private String field59;
    private String field60;
    private String field61;
    private String field62;
    private String field63;
    private String field64;
    private String field65;
    private String field66;
    private String field67;
    private String field68;
    private String field69;
    private String field70;
    private String field71;
    private String field72;
    private String field73;
    private String field74;
    private String field75;
    private String field76;
    private String field77;
    private String field78;
    private String field79;
    private String field80;
    private String field81;
    private String field82;
    private String field83;
    private String field84;
    private String field85;
    private String field86;
    private String field87;
    private String field88;
    private String field89;
    private String field90;
    private String field91;
    private String field92;
    private String field93;
    private String field94;
    private String field95;
    private String field96;
    private String field97;
    private String field98;
    private String field99;

    /**
     * 所属部门
     */
    private Department department;
    /**
     * 岗位
     */
    private Position position;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
//        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((diploma == null) ? 0 : diploma.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        result = prime * result + ((field00 == null) ? 0 : field00.hashCode());
        result = prime * result + ((field01 == null) ? 0 : field01.hashCode());
        result = prime * result + ((field02 == null) ? 0 : field02.hashCode());
        result = prime * result + ((field03 == null) ? 0 : field03.hashCode());
        result = prime * result + ((field04 == null) ? 0 : field04.hashCode());
        result = prime * result + ((field05 == null) ? 0 : field05.hashCode());
        result = prime * result + ((field06 == null) ? 0 : field06.hashCode());
        result = prime * result + ((field07 == null) ? 0 : field07.hashCode());
        result = prime * result + ((field08 == null) ? 0 : field08.hashCode());
        result = prime * result + ((field09 == null) ? 0 : field09.hashCode());
        result = prime * result + ((field10 == null) ? 0 : field10.hashCode());
        result = prime * result + ((field11 == null) ? 0 : field11.hashCode());
        result = prime * result + ((field12 == null) ? 0 : field12.hashCode());
        result = prime * result + ((field13 == null) ? 0 : field13.hashCode());
        result = prime * result + ((field14 == null) ? 0 : field14.hashCode());
        result = prime * result + ((field15 == null) ? 0 : field15.hashCode());
        result = prime * result + ((field16 == null) ? 0 : field16.hashCode());
        result = prime * result + ((field17 == null) ? 0 : field17.hashCode());
        result = prime * result + ((field18 == null) ? 0 : field18.hashCode());
        result = prime * result + ((field19 == null) ? 0 : field19.hashCode());
        result = prime * result + ((field20 == null) ? 0 : field20.hashCode());
        result = prime * result + ((field21 == null) ? 0 : field21.hashCode());
        result = prime * result + ((field22 == null) ? 0 : field22.hashCode());
        result = prime * result + ((field23 == null) ? 0 : field23.hashCode());
        result = prime * result + ((field24 == null) ? 0 : field24.hashCode());
        result = prime * result + ((field25 == null) ? 0 : field25.hashCode());
        result = prime * result + ((field26 == null) ? 0 : field26.hashCode());
        result = prime * result + ((field27 == null) ? 0 : field27.hashCode());
        result = prime * result + ((field28 == null) ? 0 : field28.hashCode());
        result = prime * result + ((field29 == null) ? 0 : field29.hashCode());
        result = prime * result + ((field30 == null) ? 0 : field30.hashCode());
        result = prime * result + ((field31 == null) ? 0 : field31.hashCode());
        result = prime * result + ((field32 == null) ? 0 : field32.hashCode());
        result = prime * result + ((field33 == null) ? 0 : field33.hashCode());
        result = prime * result + ((field34 == null) ? 0 : field34.hashCode());
        result = prime * result + ((field35 == null) ? 0 : field35.hashCode());
        result = prime * result + ((field36 == null) ? 0 : field36.hashCode());
        result = prime * result + ((field37 == null) ? 0 : field37.hashCode());
        result = prime * result + ((field38 == null) ? 0 : field38.hashCode());
        result = prime * result + ((field39 == null) ? 0 : field39.hashCode());
        result = prime * result + ((field40 == null) ? 0 : field40.hashCode());
        result = prime * result + ((field41 == null) ? 0 : field41.hashCode());
        result = prime * result + ((field42 == null) ? 0 : field42.hashCode());
        result = prime * result + ((field43 == null) ? 0 : field43.hashCode());
        result = prime * result + ((field44 == null) ? 0 : field44.hashCode());
        result = prime * result + ((field45 == null) ? 0 : field45.hashCode());
        result = prime * result + ((field46 == null) ? 0 : field46.hashCode());
        result = prime * result + ((field47 == null) ? 0 : field47.hashCode());
        result = prime * result + ((field48 == null) ? 0 : field48.hashCode());
        result = prime * result + ((field49 == null) ? 0 : field49.hashCode());
        result = prime * result + ((field50 == null) ? 0 : field50.hashCode());
        result = prime * result + ((field51 == null) ? 0 : field51.hashCode());
        result = prime * result + ((field52 == null) ? 0 : field52.hashCode());
        result = prime * result + ((field53 == null) ? 0 : field53.hashCode());
        result = prime * result + ((field54 == null) ? 0 : field54.hashCode());
        result = prime * result + ((field55 == null) ? 0 : field55.hashCode());
        result = prime * result + ((field56 == null) ? 0 : field56.hashCode());
        result = prime * result + ((field57 == null) ? 0 : field57.hashCode());
        result = prime * result + ((field58 == null) ? 0 : field58.hashCode());
        result = prime * result + ((field59 == null) ? 0 : field59.hashCode());
        result = prime * result + ((field60 == null) ? 0 : field60.hashCode());
        result = prime * result + ((field61 == null) ? 0 : field61.hashCode());
        result = prime * result + ((field62 == null) ? 0 : field62.hashCode());
        result = prime * result + ((field63 == null) ? 0 : field63.hashCode());
        result = prime * result + ((field64 == null) ? 0 : field64.hashCode());
        result = prime * result + ((field65 == null) ? 0 : field65.hashCode());
        result = prime * result + ((field66 == null) ? 0 : field66.hashCode());
        result = prime * result + ((field67 == null) ? 0 : field67.hashCode());
        result = prime * result + ((field68 == null) ? 0 : field68.hashCode());
        result = prime * result + ((field69 == null) ? 0 : field69.hashCode());
        result = prime * result + ((field70 == null) ? 0 : field70.hashCode());
        result = prime * result + ((field71 == null) ? 0 : field71.hashCode());
        result = prime * result + ((field72 == null) ? 0 : field72.hashCode());
        result = prime * result + ((field73 == null) ? 0 : field73.hashCode());
        result = prime * result + ((field74 == null) ? 0 : field74.hashCode());
        result = prime * result + ((field75 == null) ? 0 : field75.hashCode());
        result = prime * result + ((field76 == null) ? 0 : field76.hashCode());
        result = prime * result + ((field77 == null) ? 0 : field77.hashCode());
        result = prime * result + ((field78 == null) ? 0 : field78.hashCode());
        result = prime * result + ((field79 == null) ? 0 : field79.hashCode());
        result = prime * result + ((field80 == null) ? 0 : field80.hashCode());
        result = prime * result + ((field81 == null) ? 0 : field81.hashCode());
        result = prime * result + ((field82 == null) ? 0 : field82.hashCode());
        result = prime * result + ((field83 == null) ? 0 : field83.hashCode());
        result = prime * result + ((field84 == null) ? 0 : field84.hashCode());
        result = prime * result + ((field85 == null) ? 0 : field85.hashCode());
        result = prime * result + ((field86 == null) ? 0 : field86.hashCode());
        result = prime * result + ((field87 == null) ? 0 : field87.hashCode());
        result = prime * result + ((field88 == null) ? 0 : field88.hashCode());
        result = prime * result + ((field89 == null) ? 0 : field89.hashCode());
        result = prime * result + ((field90 == null) ? 0 : field90.hashCode());
        result = prime * result + ((field91 == null) ? 0 : field91.hashCode());
        result = prime * result + ((field92 == null) ? 0 : field92.hashCode());
        result = prime * result + ((field93 == null) ? 0 : field93.hashCode());
        result = prime * result + ((field94 == null) ? 0 : field94.hashCode());
        result = prime * result + ((field95 == null) ? 0 : field95.hashCode());
        result = prime * result + ((field96 == null) ? 0 : field96.hashCode());
        result = prime * result + ((field97 == null) ? 0 : field97.hashCode());
        result = prime * result + ((field98 == null) ? 0 : field98.hashCode());
        result = prime * result + ((field99 == null) ? 0 : field99.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
        result = prime * result + ((innerTel == null) ? 0 : innerTel.hashCode());
        result = prime * result + ((job == null) ? 0 : job.hashCode());
//        result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
        result = prime * result + ((leaved == null) ? 0 : leaved.hashCode());
//        result = prime * result + ((loginDate == null) ? 0 : loginDate.hashCode());
        result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
        result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((no == null) ? 0 : no.hashCode());
        result = prime * result + ((outerTel == null) ? 0 : outerTel.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
        result = prime * result + ((picture == null) ? 0 : picture.hashCode());
        result = prime * result + ((pinyin == null) ? 0 : pinyin.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((qq == null) ? 0 : qq.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((weixin == null) ? 0 : weixin.hashCode());
        result = prime * result + ((weixinQrcode == null) ? 0 : weixinQrcode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
//        if (birthday == null) {
//            if (other.birthday != null)
//                return false;
//        } else if (!birthday.equals(other.birthday))
//            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        if (diploma == null) {
            if (other.diploma != null)
                return false;
        } else if (!diploma.equals(other.diploma))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fax == null) {
            if (other.fax != null)
                return false;
        } else if (!fax.equals(other.fax))
            return false;
        if (field00 == null) {
            if (other.field00 != null)
                return false;
        } else if (!field00.equals(other.field00))
            return false;
        if (field01 == null) {
            if (other.field01 != null)
                return false;
        } else if (!field01.equals(other.field01))
            return false;
        if (field02 == null) {
            if (other.field02 != null)
                return false;
        } else if (!field02.equals(other.field02))
            return false;
        if (field03 == null) {
            if (other.field03 != null)
                return false;
        } else if (!field03.equals(other.field03))
            return false;
        if (field04 == null) {
            if (other.field04 != null)
                return false;
        } else if (!field04.equals(other.field04))
            return false;
        if (field05 == null) {
            if (other.field05 != null)
                return false;
        } else if (!field05.equals(other.field05))
            return false;
        if (field06 == null) {
            if (other.field06 != null)
                return false;
        } else if (!field06.equals(other.field06))
            return false;
        if (field07 == null) {
            if (other.field07 != null)
                return false;
        } else if (!field07.equals(other.field07))
            return false;
        if (field08 == null) {
            if (other.field08 != null)
                return false;
        } else if (!field08.equals(other.field08))
            return false;
        if (field09 == null) {
            if (other.field09 != null)
                return false;
        } else if (!field09.equals(other.field09))
            return false;
        if (field10 == null) {
            if (other.field10 != null)
                return false;
        } else if (!field10.equals(other.field10))
            return false;
        if (field11 == null) {
            if (other.field11 != null)
                return false;
        } else if (!field11.equals(other.field11))
            return false;
        if (field12 == null) {
            if (other.field12 != null)
                return false;
        } else if (!field12.equals(other.field12))
            return false;
        if (field13 == null) {
            if (other.field13 != null)
                return false;
        } else if (!field13.equals(other.field13))
            return false;
        if (field14 == null) {
            if (other.field14 != null)
                return false;
        } else if (!field14.equals(other.field14))
            return false;
        if (field15 == null) {
            if (other.field15 != null)
                return false;
        } else if (!field15.equals(other.field15))
            return false;
        if (field16 == null) {
            if (other.field16 != null)
                return false;
        } else if (!field16.equals(other.field16))
            return false;
        if (field17 == null) {
            if (other.field17 != null)
                return false;
        } else if (!field17.equals(other.field17))
            return false;
        if (field18 == null) {
            if (other.field18 != null)
                return false;
        } else if (!field18.equals(other.field18))
            return false;
        if (field19 == null) {
            if (other.field19 != null)
                return false;
        } else if (!field19.equals(other.field19))
            return false;
        if (field20 == null) {
            if (other.field20 != null)
                return false;
        } else if (!field20.equals(other.field20))
            return false;
        if (field21 == null) {
            if (other.field21 != null)
                return false;
        } else if (!field21.equals(other.field21))
            return false;
        if (field22 == null) {
            if (other.field22 != null)
                return false;
        } else if (!field22.equals(other.field22))
            return false;
        if (field23 == null) {
            if (other.field23 != null)
                return false;
        } else if (!field23.equals(other.field23))
            return false;
        if (field24 == null) {
            if (other.field24 != null)
                return false;
        } else if (!field24.equals(other.field24))
            return false;
        if (field25 == null) {
            if (other.field25 != null)
                return false;
        } else if (!field25.equals(other.field25))
            return false;
        if (field26 == null) {
            if (other.field26 != null)
                return false;
        } else if (!field26.equals(other.field26))
            return false;
        if (field27 == null) {
            if (other.field27 != null)
                return false;
        } else if (!field27.equals(other.field27))
            return false;
        if (field28 == null) {
            if (other.field28 != null)
                return false;
        } else if (!field28.equals(other.field28))
            return false;
        if (field29 == null) {
            if (other.field29 != null)
                return false;
        } else if (!field29.equals(other.field29))
            return false;
        if (field30 == null) {
            if (other.field30 != null)
                return false;
        } else if (!field30.equals(other.field30))
            return false;
        if (field31 == null) {
            if (other.field31 != null)
                return false;
        } else if (!field31.equals(other.field31))
            return false;
        if (field32 == null) {
            if (other.field32 != null)
                return false;
        } else if (!field32.equals(other.field32))
            return false;
        if (field33 == null) {
            if (other.field33 != null)
                return false;
        } else if (!field33.equals(other.field33))
            return false;
        if (field34 == null) {
            if (other.field34 != null)
                return false;
        } else if (!field34.equals(other.field34))
            return false;
        if (field35 == null) {
            if (other.field35 != null)
                return false;
        } else if (!field35.equals(other.field35))
            return false;
        if (field36 == null) {
            if (other.field36 != null)
                return false;
        } else if (!field36.equals(other.field36))
            return false;
        if (field37 == null) {
            if (other.field37 != null)
                return false;
        } else if (!field37.equals(other.field37))
            return false;
        if (field38 == null) {
            if (other.field38 != null)
                return false;
        } else if (!field38.equals(other.field38))
            return false;
        if (field39 == null) {
            if (other.field39 != null)
                return false;
        } else if (!field39.equals(other.field39))
            return false;
        if (field40 == null) {
            if (other.field40 != null)
                return false;
        } else if (!field40.equals(other.field40))
            return false;
        if (field41 == null) {
            if (other.field41 != null)
                return false;
        } else if (!field41.equals(other.field41))
            return false;
        if (field42 == null) {
            if (other.field42 != null)
                return false;
        } else if (!field42.equals(other.field42))
            return false;
        if (field43 == null) {
            if (other.field43 != null)
                return false;
        } else if (!field43.equals(other.field43))
            return false;
        if (field44 == null) {
            if (other.field44 != null)
                return false;
        } else if (!field44.equals(other.field44))
            return false;
        if (field45 == null) {
            if (other.field45 != null)
                return false;
        } else if (!field45.equals(other.field45))
            return false;
        if (field46 == null) {
            if (other.field46 != null)
                return false;
        } else if (!field46.equals(other.field46))
            return false;
        if (field47 == null) {
            if (other.field47 != null)
                return false;
        } else if (!field47.equals(other.field47))
            return false;
        if (field48 == null) {
            if (other.field48 != null)
                return false;
        } else if (!field48.equals(other.field48))
            return false;
        if (field49 == null) {
            if (other.field49 != null)
                return false;
        } else if (!field49.equals(other.field49))
            return false;
        if (field50 == null) {
            if (other.field50 != null)
                return false;
        } else if (!field50.equals(other.field50))
            return false;
        if (field51 == null) {
            if (other.field51 != null)
                return false;
        } else if (!field51.equals(other.field51))
            return false;
        if (field52 == null) {
            if (other.field52 != null)
                return false;
        } else if (!field52.equals(other.field52))
            return false;
        if (field53 == null) {
            if (other.field53 != null)
                return false;
        } else if (!field53.equals(other.field53))
            return false;
        if (field54 == null) {
            if (other.field54 != null)
                return false;
        } else if (!field54.equals(other.field54))
            return false;
        if (field55 == null) {
            if (other.field55 != null)
                return false;
        } else if (!field55.equals(other.field55))
            return false;
        if (field56 == null) {
            if (other.field56 != null)
                return false;
        } else if (!field56.equals(other.field56))
            return false;
        if (field57 == null) {
            if (other.field57 != null)
                return false;
        } else if (!field57.equals(other.field57))
            return false;
        if (field58 == null) {
            if (other.field58 != null)
                return false;
        } else if (!field58.equals(other.field58))
            return false;
        if (field59 == null) {
            if (other.field59 != null)
                return false;
        } else if (!field59.equals(other.field59))
            return false;
        if (field60 == null) {
            if (other.field60 != null)
                return false;
        } else if (!field60.equals(other.field60))
            return false;
        if (field61 == null) {
            if (other.field61 != null)
                return false;
        } else if (!field61.equals(other.field61))
            return false;
        if (field62 == null) {
            if (other.field62 != null)
                return false;
        } else if (!field62.equals(other.field62))
            return false;
        if (field63 == null) {
            if (other.field63 != null)
                return false;
        } else if (!field63.equals(other.field63))
            return false;
        if (field64 == null) {
            if (other.field64 != null)
                return false;
        } else if (!field64.equals(other.field64))
            return false;
        if (field65 == null) {
            if (other.field65 != null)
                return false;
        } else if (!field65.equals(other.field65))
            return false;
        if (field66 == null) {
            if (other.field66 != null)
                return false;
        } else if (!field66.equals(other.field66))
            return false;
        if (field67 == null) {
            if (other.field67 != null)
                return false;
        } else if (!field67.equals(other.field67))
            return false;
        if (field68 == null) {
            if (other.field68 != null)
                return false;
        } else if (!field68.equals(other.field68))
            return false;
        if (field69 == null) {
            if (other.field69 != null)
                return false;
        } else if (!field69.equals(other.field69))
            return false;
        if (field70 == null) {
            if (other.field70 != null)
                return false;
        } else if (!field70.equals(other.field70))
            return false;
        if (field71 == null) {
            if (other.field71 != null)
                return false;
        } else if (!field71.equals(other.field71))
            return false;
        if (field72 == null) {
            if (other.field72 != null)
                return false;
        } else if (!field72.equals(other.field72))
            return false;
        if (field73 == null) {
            if (other.field73 != null)
                return false;
        } else if (!field73.equals(other.field73))
            return false;
        if (field74 == null) {
            if (other.field74 != null)
                return false;
        } else if (!field74.equals(other.field74))
            return false;
        if (field75 == null) {
            if (other.field75 != null)
                return false;
        } else if (!field75.equals(other.field75))
            return false;
        if (field76 == null) {
            if (other.field76 != null)
                return false;
        } else if (!field76.equals(other.field76))
            return false;
        if (field77 == null) {
            if (other.field77 != null)
                return false;
        } else if (!field77.equals(other.field77))
            return false;
        if (field78 == null) {
            if (other.field78 != null)
                return false;
        } else if (!field78.equals(other.field78))
            return false;
        if (field79 == null) {
            if (other.field79 != null)
                return false;
        } else if (!field79.equals(other.field79))
            return false;
        if (field80 == null) {
            if (other.field80 != null)
                return false;
        } else if (!field80.equals(other.field80))
            return false;
        if (field81 == null) {
            if (other.field81 != null)
                return false;
        } else if (!field81.equals(other.field81))
            return false;
        if (field82 == null) {
            if (other.field82 != null)
                return false;
        } else if (!field82.equals(other.field82))
            return false;
        if (field83 == null) {
            if (other.field83 != null)
                return false;
        } else if (!field83.equals(other.field83))
            return false;
        if (field84 == null) {
            if (other.field84 != null)
                return false;
        } else if (!field84.equals(other.field84))
            return false;
        if (field85 == null) {
            if (other.field85 != null)
                return false;
        } else if (!field85.equals(other.field85))
            return false;
        if (field86 == null) {
            if (other.field86 != null)
                return false;
        } else if (!field86.equals(other.field86))
            return false;
        if (field87 == null) {
            if (other.field87 != null)
                return false;
        } else if (!field87.equals(other.field87))
            return false;
        if (field88 == null) {
            if (other.field88 != null)
                return false;
        } else if (!field88.equals(other.field88))
            return false;
        if (field89 == null) {
            if (other.field89 != null)
                return false;
        } else if (!field89.equals(other.field89))
            return false;
        if (field90 == null) {
            if (other.field90 != null)
                return false;
        } else if (!field90.equals(other.field90))
            return false;
        if (field91 == null) {
            if (other.field91 != null)
                return false;
        } else if (!field91.equals(other.field91))
            return false;
        if (field92 == null) {
            if (other.field92 != null)
                return false;
        } else if (!field92.equals(other.field92))
            return false;
        if (field93 == null) {
            if (other.field93 != null)
                return false;
        } else if (!field93.equals(other.field93))
            return false;
        if (field94 == null) {
            if (other.field94 != null)
                return false;
        } else if (!field94.equals(other.field94))
            return false;
        if (field95 == null) {
            if (other.field95 != null)
                return false;
        } else if (!field95.equals(other.field95))
            return false;
        if (field96 == null) {
            if (other.field96 != null)
                return false;
        } else if (!field96.equals(other.field96))
            return false;
        if (field97 == null) {
            if (other.field97 != null)
                return false;
        } else if (!field97.equals(other.field97))
            return false;
        if (field98 == null) {
            if (other.field98 != null)
                return false;
        } else if (!field98.equals(other.field98))
            return false;
        if (field99 == null) {
            if (other.field99 != null)
                return false;
        } else if (!field99.equals(other.field99))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (idCard == null) {
            if (other.idCard != null)
                return false;
        } else if (!idCard.equals(other.idCard))
            return false;
        if (innerTel == null) {
            if (other.innerTel != null)
                return false;
        } else if (!innerTel.equals(other.innerTel))
            return false;
        if (job == null) {
            if (other.job != null)
                return false;
        } else if (!job.equals(other.job))
            return false;
//        if (joinDate == null) {
//            if (other.joinDate != null)
//                return false;
//        } else if (!joinDate.equals(other.joinDate))
//            return false;
        if (leaved == null) {
            if (other.leaved != null)
                return false;
        } else if (!leaved.equals(other.leaved))
            return false;
//        if (loginDate == null) {
//            if (other.loginDate != null)
//                return false;
//        } else if (!loginDate.equals(other.loginDate))
//            return false;
        if (maritalStatus == null) {
            if (other.maritalStatus != null)
                return false;
        } else if (!maritalStatus.equals(other.maritalStatus))
            return false;
        if (mobile == null) {
            if (other.mobile != null)
                return false;
        } else if (!mobile.equals(other.mobile))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no == null) {
            if (other.no != null)
                return false;
        } else if (!no.equals(other.no))
            return false;
        if (outerTel == null) {
            if (other.outerTel != null)
                return false;
        } else if (!outerTel.equals(other.outerTel))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (permanentAddress == null) {
            if (other.permanentAddress != null)
                return false;
        } else if (!permanentAddress.equals(other.permanentAddress))
            return false;
        if (picture == null) {
            if (other.picture != null)
                return false;
        } else if (!picture.equals(other.picture))
            return false;
        if (pinyin == null) {
            if (other.pinyin != null)
                return false;
        } else if (!pinyin.equals(other.pinyin))
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        if (qq == null) {
            if (other.qq != null)
                return false;
        } else if (!qq.equals(other.qq))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        } else if (!sex.equals(other.sex))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (weixin == null) {
            if (other.weixin != null)
                return false;
        } else if (!weixin.equals(other.weixin))
            return false;
        if (weixinQrcode == null) {
            if (other.weixinQrcode != null)
                return false;
        } else if (!weixinQrcode.equals(other.weixinQrcode))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [id=");
        builder.append(id);
        builder.append(", account=");
        builder.append(account);
        builder.append(", password=");
        builder.append(password);
        builder.append(", status=");
        builder.append(status);
        builder.append(", name=");
        builder.append(name);
        builder.append(", no=");
        builder.append(no);
        builder.append(", sex=");
        builder.append(sex);
//        builder.append(", birthday=");
//        builder.append(birthday);
        builder.append(", mobile=");
        builder.append(mobile);
        builder.append(", innerTel=");
        builder.append(innerTel);
        builder.append(", outerTel=");
        builder.append(outerTel);
        builder.append(", weixin=");
        builder.append(weixin);
        builder.append(", weixinQrcode=");
        builder.append(weixinQrcode);
        builder.append(", fax=");
        builder.append(fax);
        builder.append(", qq=");
        builder.append(qq);
        builder.append(", email=");
        builder.append(email);
        builder.append(", picture=");
        builder.append(picture);
        builder.append(", type=");
        builder.append(type);
        builder.append(", address=");
        builder.append(address);
        builder.append(", leaved=");
        builder.append(leaved);
        builder.append(", joinDate=");
//        builder.append(joinDate);
        builder.append(", idCard=");
        builder.append(idCard);
        builder.append(", diploma=");
        builder.append(diploma);
        builder.append(", maritalStatus=");
        builder.append(maritalStatus);
        builder.append(", age=");
        builder.append(age);
        builder.append(", job=");
        builder.append(job);
        builder.append(", permanentAddress=");
        builder.append(permanentAddress);
        builder.append(", loginDate=");
//        builder.append(loginDate);
        builder.append(", pinyin=");
        builder.append(pinyin);
        builder.append(", field00=");
        builder.append(field00);
        builder.append(", field01=");
        builder.append(field01);
        builder.append(", field02=");
        builder.append(field02);
        builder.append(", field03=");
        builder.append(field03);
        builder.append(", field04=");
        builder.append(field04);
        builder.append(", field05=");
        builder.append(field05);
        builder.append(", field06=");
        builder.append(field06);
        builder.append(", field07=");
        builder.append(field07);
        builder.append(", field08=");
        builder.append(field08);
        builder.append(", field09=");
        builder.append(field09);
        builder.append(", field10=");
        builder.append(field10);
        builder.append(", field11=");
        builder.append(field11);
        builder.append(", field12=");
        builder.append(field12);
        builder.append(", field13=");
        builder.append(field13);
        builder.append(", field14=");
        builder.append(field14);
        builder.append(", field15=");
        builder.append(field15);
        builder.append(", field16=");
        builder.append(field16);
        builder.append(", field17=");
        builder.append(field17);
        builder.append(", field18=");
        builder.append(field18);
        builder.append(", field19=");
        builder.append(field19);
        builder.append(", field20=");
        builder.append(field20);
        builder.append(", field21=");
        builder.append(field21);
        builder.append(", field22=");
        builder.append(field22);
        builder.append(", field23=");
        builder.append(field23);
        builder.append(", field24=");
        builder.append(field24);
        builder.append(", field25=");
        builder.append(field25);
        builder.append(", field26=");
        builder.append(field26);
        builder.append(", field27=");
        builder.append(field27);
        builder.append(", field28=");
        builder.append(field28);
        builder.append(", field29=");
        builder.append(field29);
        builder.append(", field30=");
        builder.append(field30);
        builder.append(", field31=");
        builder.append(field31);
        builder.append(", field32=");
        builder.append(field32);
        builder.append(", field33=");
        builder.append(field33);
        builder.append(", field34=");
        builder.append(field34);
        builder.append(", field35=");
        builder.append(field35);
        builder.append(", field36=");
        builder.append(field36);
        builder.append(", field37=");
        builder.append(field37);
        builder.append(", field38=");
        builder.append(field38);
        builder.append(", field39=");
        builder.append(field39);
        builder.append(", field40=");
        builder.append(field40);
        builder.append(", field41=");
        builder.append(field41);
        builder.append(", field42=");
        builder.append(field42);
        builder.append(", field43=");
        builder.append(field43);
        builder.append(", field44=");
        builder.append(field44);
        builder.append(", field45=");
        builder.append(field45);
        builder.append(", field46=");
        builder.append(field46);
        builder.append(", field47=");
        builder.append(field47);
        builder.append(", field48=");
        builder.append(field48);
        builder.append(", field49=");
        builder.append(field49);
        builder.append(", field50=");
        builder.append(field50);
        builder.append(", field51=");
        builder.append(field51);
        builder.append(", field52=");
        builder.append(field52);
        builder.append(", field53=");
        builder.append(field53);
        builder.append(", field54=");
        builder.append(field54);
        builder.append(", field55=");
        builder.append(field55);
        builder.append(", field56=");
        builder.append(field56);
        builder.append(", field57=");
        builder.append(field57);
        builder.append(", field58=");
        builder.append(field58);
        builder.append(", field59=");
        builder.append(field59);
        builder.append(", field60=");
        builder.append(field60);
        builder.append(", field61=");
        builder.append(field61);
        builder.append(", field62=");
        builder.append(field62);
        builder.append(", field63=");
        builder.append(field63);
        builder.append(", field64=");
        builder.append(field64);
        builder.append(", field65=");
        builder.append(field65);
        builder.append(", field66=");
        builder.append(field66);
        builder.append(", field67=");
        builder.append(field67);
        builder.append(", field68=");
        builder.append(field68);
        builder.append(", field69=");
        builder.append(field69);
        builder.append(", field70=");
        builder.append(field70);
        builder.append(", field71=");
        builder.append(field71);
        builder.append(", field72=");
        builder.append(field72);
        builder.append(", field73=");
        builder.append(field73);
        builder.append(", field74=");
        builder.append(field74);
        builder.append(", field75=");
        builder.append(field75);
        builder.append(", field76=");
        builder.append(field76);
        builder.append(", field77=");
        builder.append(field77);
        builder.append(", field78=");
        builder.append(field78);
        builder.append(", field79=");
        builder.append(field79);
        builder.append(", field80=");
        builder.append(field80);
        builder.append(", field81=");
        builder.append(field81);
        builder.append(", field82=");
        builder.append(field82);
        builder.append(", field83=");
        builder.append(field83);
        builder.append(", field84=");
        builder.append(field84);
        builder.append(", field85=");
        builder.append(field85);
        builder.append(", field86=");
        builder.append(field86);
        builder.append(", field87=");
        builder.append(field87);
        builder.append(", field88=");
        builder.append(field88);
        builder.append(", field89=");
        builder.append(field89);
        builder.append(", field90=");
        builder.append(field90);
        builder.append(", field91=");
        builder.append(field91);
        builder.append(", field92=");
        builder.append(field92);
        builder.append(", field93=");
        builder.append(field93);
        builder.append(", field94=");
        builder.append(field94);
        builder.append(", field95=");
        builder.append(field95);
        builder.append(", field96=");
        builder.append(field96);
        builder.append(", field97=");
        builder.append(field97);
        builder.append(", field98=");
        builder.append(field98);
        builder.append(", field99=");
        builder.append(field99);
        builder.append(", department=");
        builder.append(department);
        builder.append(", position=");
        builder.append(position);
        builder.append("]");
        return builder.toString();
    }
}
