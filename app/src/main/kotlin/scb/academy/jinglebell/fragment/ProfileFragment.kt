package scb.academy.jinglebell.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_profile.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import scb.academy.jinglebell.R
import scb.academy.jinglebell.adapter.CountryAdapter
import scb.academy.jinglebell.service.ApiManager
import scb.academy.jinglebell.vo.Country
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.KeyEvent.KEYCODE_DPAD_CENTER
import android.view.KeyEvent
import android.content.Intent
import scb.academy.jinglebell.activity.ProfileActivity


class ProfileFragment : Fragment() {

    private lateinit var nickname: EditText
//    private lateinit var intent: Intent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nickname = view.findViewById(R.id.mNicknameEditText)
        nickname.apply {

            nickname.setOnKeyListener(object : View.OnKeyListener {
                override fun onKey(v: View, keyCode: Int, event: KeyEvent): Boolean {
                    if (event.action == KeyEvent.ACTION_DOWN && keyCode == KEYCODE_ENTER) {

//                        val intent = Intent(activity, ProfileFragment::class.java).also {
//                            it.putExtra("EdiTtEXTvALUE", nickname.text.toString())
//
//                            startActivity(it)
//                        }

                        val intent = Intent(v.context, ProfileActivity::class.java)
                        intent.putExtra("EdiTtEXTvALUE", nickname.text.toString())
                        v.context.startActivity(intent)


//                        startActivity(intent)
//                        Log.d("name", "hello")
                        Toast.makeText(context, nickname.text.toString(), Toast.LENGTH_SHORT).show()
                        return true
                    } else {
                        return false
                    }
                }
            })

        }
    }

}



