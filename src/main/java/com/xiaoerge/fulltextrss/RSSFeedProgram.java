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
public class RSSFeedProgram {

    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser("http://rss.cnn.com/rss/cnn_topstories.rss", true);
        RSSFeed feed = parser.readFeed();
        System.out.println(feed);
        for (RSSFeedMessage message : feed.getMessages()) {
            System.out.println(message.getTitle());
            System.out.println(message.getDescription());
            System.out.println();
        }
    }
}
