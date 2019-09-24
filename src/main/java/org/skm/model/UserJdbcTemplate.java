package org.skm.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zjuskm
 * 2019-09-22
 */
@Component("userJdbcTemplate")
public class UserJdbcTemplate {
    @Value("1")
    private Long id;

    @Value("user_name_1")
    private String userName;

    @Value("note_1")
    private String note;

    private SexEnum sex = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
