//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package tk.woppo.sunday.widget;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;
import tk.woppo.sunday.R.id;
import tk.woppo.sunday.R.layout;


/**
 * We use @SuppressWarning here because our java code
 * generator doesn't know that there is no need
 * to import OnXXXListeners from View as we already
 * are in a View.
 * 
 */
@SuppressWarnings("unused")
public final class SimpleWeatherItem_
    extends SimpleWeatherItem
    implements HasViews, OnViewChangedListener
{

    private boolean alreadyInflated_ = false;
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    public SimpleWeatherItem_(Context context) {
        super(context);
        init_();
    }

    public static SimpleWeatherItem build(Context context) {
        SimpleWeatherItem_ instance = new SimpleWeatherItem_(context);
        instance.onFinishInflate();
        return instance;
    }

    /**
     * The mAlreadyInflated_ hack is needed because of an Android bug
     * which leads to infinite calls of onFinishInflate()
     * when inflating a layout with a parent and using
     * the <merge /> tag.
     * 
     */
    @Override
    public void onFinishInflate() {
        if (!alreadyInflated_) {
            alreadyInflated_ = true;
            inflate(getContext(), layout.layout_simple_item, this);
            onViewChangedNotifier_.notifyViewChanged(this);
        }
        super.onFinishInflate();
    }

    private void init_() {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tvWeather = ((TextView) hasViews.findViewById(id.tv_simple_item_weather));
        tvWeek = ((TextView) hasViews.findViewById(id.tv_simple_item_week));
        ll = ((LinearLayout) hasViews.findViewById(id.ll_simple_item));
        tvTemp = ((TextView) hasViews.findViewById(id.tv_simple_item_temp));
        ivWeather = ((ImageView) hasViews.findViewById(id.iv_simple_item_Weather));
    }

}
