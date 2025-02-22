package com.adammcneilly.toa.core.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ButtonDefaults.textButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import com.adammcneilly.toa.R
import com.adammcneilly.toa.core.ui.theme.ButtonShape
import com.adammcneilly.toa.core.ui.theme.TOATheme

/**
 * This is a custom [TextButton] that provides the shape and styling expected
 * in the TOA application.
 *
 * @param[text] The text inside the button.
 * @param[onClick] A callback invoked when the user clicks the button.
 * @param[modifier] An optional [Modifier] to configure this component.
 */
@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentColor: Color = MaterialTheme.colorScheme.primary,
    enabled: Boolean = true,
) {

    val buttonColors = textButtonColors(
        contentColor = contentColor,
    )

    TextButton(
        onClick = onClick,
        shape = ButtonShape,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),
        colors = buttonColors,
        enabled = enabled,
    ) {
        Text(
            text = text.toUpperCase(Locale.current),
        )
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "enabled",
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    group = "enabled",
)
@Composable
@Suppress("UnusedPrivateMember")
private fun SecondaryButtonPreview() {
    TOATheme {
        Surface {
            SecondaryButton(
                text = "Primary button",
                onClick = {},
            )
        }
    }
}

@Preview(
    name = "Night Mode - Disabled",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    group = "disabled",
)
@Preview(
    name = "Day Mode - Disabled",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    group = "disabled",
)
@Composable
@Suppress("UnusedPrivateMember")
private fun DisabledSecondaryButtonPreview() {
    TOATheme {
        Surface {
            SecondaryButton(
                text = "Primary button",
                onClick = {},
                enabled = false,
            )
        }
    }
}
