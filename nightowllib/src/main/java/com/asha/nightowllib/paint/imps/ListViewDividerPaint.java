package com.asha.nightowllib.paint.imps;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ListView;

import com.asha.nightowllib.paint.ColorBox;
import com.asha.nightowllib.paint.IOwlPaint;

/**
 * Created by hzqiujiadi on 15/11/13.
 * hzqiujiadi ashqalcn@gmail.com
 */
public class ListViewDividerPaint implements IOwlPaint {
    @Override
    public void draw(@NonNull View view, @NonNull Object value) {
        ListView listView = (ListView) view;
        int listHeight = listView.getDividerHeight();
        listView.setDivider((Drawable) value);
        listView.setDividerHeight(listHeight);
    }

    @Override
    public void setup(@NonNull View view, @NonNull TypedArray a, int attr, int scope, @NonNull ColorBox into) {
        ListView listView = (ListView) view;
        Drawable drawable1 = listView.getDivider();
        Drawable drawable2 = a.getDrawable(attr);
        into.put(attr,scope,drawable1,drawable2);
    }
}
