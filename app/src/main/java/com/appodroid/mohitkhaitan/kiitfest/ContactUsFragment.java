package com.appodroid.mohitkhaitan.kiitfest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by MOHIT KHAITAN on 10-02-2016.
 */
public class ContactUsFragment extends Fragment implements OnMapReadyCallback {

    public ContactUsFragment() {
    }


    private GoogleMap mMap;
    TextView email, phn;
    private static View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);

        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null) {
                parent.removeView(view);
            }
        }

        try {
            view = inflater.inflate(R.layout.fragment_contact_us, container, false);

            email = (TextView) view.findViewById(R.id.email_detail);
            phn = (TextView) view.findViewById(R.id.phn_detail);

            email.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_EMAIL, "helpdesk@kiitfest.org");
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }
            });

            phn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+91-9778030494"));
                    startActivity(intent);
                }
            });

            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.maps_id);
            mapFragment.getMapAsync(this);


        } catch (InflateException e) {

        }


        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        LatLng bhubaneswar = new LatLng(20.356612, 85.818986);
        mMap.addMarker(new MarkerOptions().position(bhubaneswar).title("KiiT Student Activity Centre-KSAC").visible(true));

        CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(20.356612, 85.818986)).zoom(15).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setRotateGesturesEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

    }

}
