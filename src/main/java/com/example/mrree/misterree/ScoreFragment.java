package com.example.mrree.misterree;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.Key;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ScoreFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ScoreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScoreFragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ScoreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ScoreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ScoreFragment newInstance(String param1, String param2) {
        ScoreFragment fragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    // Player 1
    Button p1addButton;
    Button p1minusButton;
    TextView p1score;
    int p1counter = 0;


    // Player 2
    Button p2addButton;
    Button p2minusButton;
    TextView p2score;
    int p2counter = 0;

    // Player 3
    Button p3addButton;
    Button p3minusButton;
    TextView p3score;
    int p3counter = 0;

    //Player 4
    Button p4addButton;
    Button p4minusButton;
    TextView p4score;
    int p4counter = 0;

    //Player 5
    Button p5addButton;
    Button p5minusButton;
    TextView p5score;
    int p5counter = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_score, container, false);

        p1addButton = (Button) rootView.findViewById(R.id.p1_add_button);
        p1minusButton = (Button) rootView.findViewById(R.id.p1_minus_button);
        p1score = (TextView) rootView.findViewById(R.id.p1_score_counter);

        p1addButton.setOnClickListener(this);
        p1minusButton.setOnClickListener(this);
        p1score.setOnClickListener(this);

        p2addButton = (Button) rootView.findViewById(R.id.p2_add_button);
        p2minusButton = (Button) rootView.findViewById(R.id.p2_minus_button);
        p2score = (TextView) rootView.findViewById(R.id.p2_score_counter);

        p2addButton.setOnClickListener(this);
        p2minusButton.setOnClickListener(this);
        p2score.setOnClickListener(this);

        p3addButton = (Button) rootView.findViewById(R.id.p3_add_button);
        p3minusButton = (Button) rootView.findViewById(R.id.p3_minus_button);
        p3score = (TextView) rootView.findViewById(R.id.p3_score_counter);

        p3addButton.setOnClickListener(this);
        p3minusButton.setOnClickListener(this);
        p3score.setOnClickListener(this);

        p4addButton = (Button) rootView.findViewById(R.id.p4_add_button);
        p4minusButton = (Button) rootView.findViewById(R.id.p4_minus_button);
        p4score = (TextView) rootView.findViewById(R.id.p4_score_counter);

        p4addButton.setOnClickListener(this);
        p4minusButton.setOnClickListener(this);
        p4score.setOnClickListener(this);

        p5addButton = (Button) rootView.findViewById(R.id.p5_add_button);
        p5minusButton = (Button) rootView.findViewById(R.id.p5_minus_button);
        p5score = (TextView) rootView.findViewById(R.id.p5_score_counter);

        p5addButton.setOnClickListener(this);
        p5minusButton.setOnClickListener(this);
        p5score.setOnClickListener(this);

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if(v == p1addButton){
            p1counter++;
            p1score.setText(Integer.toString(p1counter));
        }

        if(v == p1minusButton){
            p1counter--;
            p1score.setText(Integer.toString(p1counter));
        }

        if(v == p2addButton){
            p2counter++;
            p2score.setText(Integer.toString(p2counter));
        }

        if(v == p2minusButton){
            p2counter--;
            p2score.setText(Integer.toString(p2counter));
        }

        if(v == p3addButton){
            p3counter++;
            p3score.setText(Integer.toString(p3counter));
        }

        if(v == p3minusButton){
            p3counter--;
            p3score.setText(Integer.toString(p3counter));
        }

        if(v == p4addButton){
            p4counter++;
            p4score.setText(Integer.toString(p4counter));
        }

        if(v == p4minusButton){
            p4counter--;
            p4score.setText(Integer.toString(p4counter));
        }

        if(v == p5addButton){
            p5counter++;
            p5score.setText(Integer.toString(p5counter));
        }

        if(v == p5minusButton){
            p5counter--;
            p5score.setText(Integer.toString(p5counter));
        }
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
