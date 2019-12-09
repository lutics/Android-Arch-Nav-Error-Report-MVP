package codes.stable.opensource.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import codes.stable.opensource.android.databinding.MainFragmentBinding

class MainFragment :
        Fragment(), View.OnClickListener {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.apply(lifecycle::addObserver)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return MainFragmentBinding.inflate(inflater, container, false).also {
            it.onClickListener = this
            it.viewModel = viewModel
        }.root
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnOne -> findNavController().navigate(R.id.action_mainFragment_to_dialogFragmentOne)
            R.id.btnTwo -> findNavController().navigate(R.id.action_mainFragment_to_dialogFragmentTwo)
            R.id.btnThree -> findNavController().navigate(R.id.action_mainFragment_to_otherActivity)
        }
    }
}