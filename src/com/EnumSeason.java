package com;

/**
 * @author herman
 * @version 1.0
 */
public class EnumSeason {
    private String name;
    private String desc;

    public final static EnumSeason SPRING = new EnumSeason("春天","春天到了");
    public final static EnumSeason SUMMER = new EnumSeason("夏天","夏天到了");
    public final static EnumSeason AUTUMN = new EnumSeason("秋天","秋天到了");
    public final static EnumSeason WINTER = new EnumSeason("冬天","冬天到了");

    private EnumSeason(String name, String desc) {
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
