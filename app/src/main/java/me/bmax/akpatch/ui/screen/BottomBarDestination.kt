package me.bmax.akpatch.ui.screen

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.vector.ImageVector
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import me.bmax.akpatch.R
import me.bmax.akpatch.ui.screen.destinations.HomeScreenDestination
import me.bmax.akpatch.ui.screen.destinations.LogScreenDestination
import me.bmax.akpatch.ui.screen.destinations.SuperUserScreenDestination
import me.bmax.akpatch.ui.screen.destinations.ModuleScreenDestination

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    @StringRes val label: Int,
    val iconSelected: ImageVector,
    val iconNotSelected: ImageVector,
) {
    Home(HomeScreenDestination, R.string.home, Icons.Filled.Home, Icons.Outlined.Home),
    SuperUser(SuperUserScreenDestination, R.string.superuser, Icons.Filled.Security, Icons.Outlined.Security),
    Module(ModuleScreenDestination, R.string.module, Icons.Filled.Dashboard, Icons.Outlined.Dashboard),
    Log(LogScreenDestination, R.string.log, Icons.Filled.Assignment, Icons.Outlined.Assignment)
}
