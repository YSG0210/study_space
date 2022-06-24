package com;

/**
 * @author herman
 * @version 1.0
 */
public class EnumSeason02 {
    public static void main(String[] args) {

    }
}

enum Season{
    SPRING("春天","凉爽"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","荒凉"),
    WINTER("冬天","寒冷");

    private String name;
    private String desc;


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "enumSeason{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
