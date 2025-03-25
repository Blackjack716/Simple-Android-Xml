package com.example.simplexml

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.ViewPropertyAnimator
import androidx.appcompat.widget.AppCompatButton

/**
 * Custom button that have followed properties:
 * @param customTextColor text color
 *
 *
 */
class CustomButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    private var customTextColor: Int = Color.WHITE

    init {
        val typedArray = context.obtainStyledAttributes(
            attrs, R.styleable.CustomButton, defStyleAttr, 0
        )
        try {
            customTextColor =
                typedArray.getColor(R.styleable.CustomButton_customTextColor, Color.WHITE)
        } finally {
            typedArray.recycle()
        }

        //Default values
        setTextColor(customTextColor)
        setBackgroundColor(Color.WHITE)
        text = "My Custom Button"
    }

    override fun animate(): ViewPropertyAnimator {
        return super.animate()
    }
}