package com.redwood2magnet.recyclerview;

public class ExampleItem {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public ExampleItem(int ImageResource,String Text1,String Text2){
        mImageResource=ImageResource;
        mText1=Text1;
        mText2=Text2;

    }

    public int getmImageResource(){
        return mImageResource;
    }
    public String getmText1(){
        return mText1;
    }
    public String getmText2(){
        return mText2;
    }

}
