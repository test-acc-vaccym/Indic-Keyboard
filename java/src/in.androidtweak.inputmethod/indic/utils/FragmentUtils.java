/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.androidtweak.inputmethod.indic.utils;

import in.androidtweak.inputmethod.dictionarypack.DictionarySettingsFragment;

import java.util.HashSet;

import in.androidtweak.inputmethod.indic.about.AboutPreferences;
import in.androidtweak.inputmethod.indic.settings.AdvancedSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.AppearanceSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.CorrectionSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.CustomInputStyleSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.DebugSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.GestureSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.MultiLingualSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.PreferencesSettingsFragment;
import in.androidtweak.inputmethod.indic.settings.SettingsFragment;
import in.androidtweak.inputmethod.indic.settings.ThemeSettingsFragment;
import in.androidtweak.inputmethod.indic.spellcheck.SpellCheckerSettingsFragment;
import in.androidtweak.inputmethod.indic.userdictionary.UserDictionaryAddWordFragment;
import in.androidtweak.inputmethod.indic.userdictionary.UserDictionaryList;
import in.androidtweak.inputmethod.indic.userdictionary.UserDictionaryLocalePicker;
import in.androidtweak.inputmethod.indic.userdictionary.UserDictionarySettings;

public class FragmentUtils {
    private static final HashSet<String> sLatinImeFragments = new HashSet<>();
    static {
        sLatinImeFragments.add(DictionarySettingsFragment.class.getName());
        sLatinImeFragments.add(AboutPreferences.class.getName());
        sLatinImeFragments.add(PreferencesSettingsFragment.class.getName());
        sLatinImeFragments.add(AppearanceSettingsFragment.class.getName());
        sLatinImeFragments.add(ThemeSettingsFragment.class.getName());
        sLatinImeFragments.add(MultiLingualSettingsFragment.class.getName());
        sLatinImeFragments.add(CustomInputStyleSettingsFragment.class.getName());
        sLatinImeFragments.add(GestureSettingsFragment.class.getName());
        sLatinImeFragments.add(CorrectionSettingsFragment.class.getName());
        sLatinImeFragments.add(AdvancedSettingsFragment.class.getName());
        sLatinImeFragments.add(DebugSettingsFragment.class.getName());
        sLatinImeFragments.add(SettingsFragment.class.getName());
        sLatinImeFragments.add(SpellCheckerSettingsFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryAddWordFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryList.class.getName());
        sLatinImeFragments.add(UserDictionaryLocalePicker.class.getName());
        sLatinImeFragments.add(UserDictionarySettings.class.getName());
    }

    public static boolean isValidFragment(String fragmentName) {
        return sLatinImeFragments.contains(fragmentName);
    }
}
