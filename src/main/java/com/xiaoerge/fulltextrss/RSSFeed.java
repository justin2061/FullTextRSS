/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiaoerge.fulltextrss;

/**
 *
 * @author xiaoerge
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Stores an RSS feed
 */
public class RSSFeed {

    private final String title;
    private final String link;
    private final String description;
    private final String language;
    private final String copyright;
    private final String pubDate;
    private final List<RSSFeedMessage> entries;

    public RSSFeed(String title, String link, String description, String language,
            String copyright, String pubDate) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.language = language;
        this.copyright = copyright;
        this.pubDate = pubDate;
        
        entries = new LinkedList<>();
    }

    public List<RSSFeedMessage> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguage() {
        return language;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getPubDate() {
        return pubDate;
    }

    @Override
    public String toString() {
        return "Feed [copyright=" + copyright + ", description=" + description
                + ", language=" + language + ", link=" + link + ", pubDate="
                + pubDate + ", title=" + title + "]";
    }

}
