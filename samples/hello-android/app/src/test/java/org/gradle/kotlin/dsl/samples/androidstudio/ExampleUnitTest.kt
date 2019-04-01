package org.gradle.kotlin.dsl.samples.androidstudio

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun use_TextUtils_in_unit_test() {
        assertFalse(android.text.TextUtils.isEmpty(
            "this string is not empty, but TextUtils.isEmpty always returns false because of mocked Android.jar"
        ))
    }

    @Test
    fun use_JSONObjects_in_unit_test() {
        val json = org.json.JSONObject();
        json.put("foo", "bar")
        // We expect that getString will return null, because we use mocked Android.jar instead of real JSONObject
        assertNull(json.getString("foo"))
    }
}
