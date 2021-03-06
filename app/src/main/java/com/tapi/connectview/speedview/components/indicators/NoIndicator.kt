package com.tapi.a0028speedtest.ui.viewscustom.speedview.components.indicators

import android.content.Context
import android.graphics.Canvas

/**
 * this Library build By Anas Altair
 * see it on [GitHub](https://github.com/anastr/SpeedView)
 */
class NoIndicator(context: Context) : Indicator<NoIndicator>(context) {

    override fun draw( canvas: Canvas, degree: Float) {}

    override fun updateIndicator() {}

    override fun setWithEffects(withEffects: Boolean) {}
}
