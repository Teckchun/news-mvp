package me.topas.rssreader.main;

import me.topas.rssreader.base.BaseView;

/**
 * Created by faruktoptas on 28/01/17.
 */

public interface MainContract {

    // User actions. Presenter will implement
    interface Presenter {
        void loadHelloText();
    }

    // Action callbacks. Activity/Fragment will implement
    interface View extends BaseView {
        void onTextLoaded(String text);
    }

}