/*
 * Copyright 2016-2019 Adrian Cotfas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.apps.adrcotfas.goodtime.Statistics;

import android.content.Context;

import com.apps.adrcotfas.goodtime.LabelAndColor;
import com.apps.adrcotfas.goodtime.R;

import static com.apps.adrcotfas.goodtime.Util.ThemeHelper.COLOR_INDEX_ALL_LABELS;
import static com.apps.adrcotfas.goodtime.Util.ThemeHelper.COLOR_INDEX_UNLABELED;

public class Utils {
    public static LabelAndColor getInstanceTotalLabel(Context context) {
        return new LabelAndColor(context.getString(R.string.label_all),
                COLOR_INDEX_ALL_LABELS);
    }

    public static LabelAndColor getInstanceUnlabeledLabel() {
        return new LabelAndColor("unlabeled", COLOR_INDEX_UNLABELED);
    }
}
