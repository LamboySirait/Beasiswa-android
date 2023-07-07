package com.example.mydel


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.example.mydel.data.local.DataMahasiswa
import com.example.mydel.util.LoginPrefs
import de.hdodenhof.circleimageview.CircleImageView

@GlideModule
class AccAdminFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnLogout: Button = view.findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener {
            val prefs = LoginPrefs(requireContext())
            prefs.setIsLogin(false)

            startActivity(Intent(context, LoginActivity::class.java))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acc_admin, container, false)
    }

}