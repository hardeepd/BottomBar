package com.roughike.bottombar;

import android.support.annotation.IdRes;

public interface ConsumeFocusInterceptor {

    boolean shouldConsumeFocus(@IdRes int newTabId);

}
