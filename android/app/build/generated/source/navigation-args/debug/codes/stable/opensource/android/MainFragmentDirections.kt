package codes.stable.opensource.android

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class MainFragmentDirections private constructor() {
  companion object {
    fun actionMainFragmentToDialogFragmentOne(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_dialogFragmentOne)

    fun actionMainFragmentToDialogFragmentTwo(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_dialogFragmentTwo)

    fun actionMainFragmentToOtherActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_otherActivity)
  }
}
