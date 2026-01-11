package zone.ien.cmpfadingedges.example.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import cmpfadingedges.example.composeapp.generated.resources.Res
import cmpfadingedges.example.composeapp.generated.resources.opensans_regular
import cmpfadingedges.example.composeapp.generated.resources.space_grotesk_bold
import org.jetbrains.compose.resources.Font

val spaceGrotesk
    @Composable get() = FontFamily(
        Font(Res.font.space_grotesk_bold, FontWeight.Normal),
    )

val openSans
    @Composable get() = FontFamily(
        Font(Res.font.opensans_regular, FontWeight.Normal),
    )