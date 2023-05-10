package org.it_academy.selenium_study;

public enum LinksForTestsEnum {
    ONLINER("https://www.onliner.by/");
    private String link;
    LinksForTestsEnum(String link){
        this.link = link;
    }
    public String getLink(){ return link;}
}
