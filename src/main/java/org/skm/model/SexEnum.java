package org.skm.model;

/**
 * Created by zjuskm
 * 2019-09-22
 */
public enum SexEnum {
    MALE(1,"男"),
    FEMALE(2,"女");
    private  int id;
    private String name;
    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // 数据库中只存id，通过代码解析成SexEnum类型
    public static SexEnum getEnumById(int id) {
        for(SexEnum sex: SexEnum.values()) {
            if(sex.getId()==id) {
                return sex;
            }
        }
        return null;
    }
}
