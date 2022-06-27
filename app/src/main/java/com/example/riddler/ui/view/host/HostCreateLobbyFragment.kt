package com.example.riddler.ui.view.host

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.riddler.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HostCreateLobbyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HostCreateLobbyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var createLobby : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var myView = inflater.inflate(R.layout.fragment_host_create_lobby, container, false)
        createLobby = myView.findViewById<Button>(R.id.createLobbyButton)
        createLobby.setOnClickListener {
            val intent = Intent(getActivity(), HostActivity::class.java)
            activity?.startActivity(intent)
            activity?.finish()
        }
        return myView
    }
}