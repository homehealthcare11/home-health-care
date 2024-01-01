package com.uptech.android_uikit;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.uptech.android_uikit.ecomerceapp.activities.CartActivity;
import com.uptech.android_uikit.ecomerceapp.activities.CheckoutActivity;
import com.uptech.android_uikit.ecomerceapp.activities.EcomerceMainActivity;
import com.uptech.android_uikit.ecomerceapp.activities.ProductDetail;
import com.uptech.android_uikit.ecomerceapp.login.LogInActivity;
import com.uptech.android_uikit.ecomerceapp.login.RegisterActivity;
import com.uptech.android_uikit.upBlog.UpBlogMainActivity;
import com.uptech.android_uikit.upBlog.loginRegistration.LoginActivity;
import com.uptech.android_uikit.upBlog.loginRegistration.RegistrationActivity;
import com.uptech.android_uikit.upBlog.singlePost.SinglePostActivity;
import com.uptech.android_uikit.upBlog.singlePost.SinglePostCommentsActivity;

public class MainDropDownFragment extends Fragment {

    private LinearLayout lytLoginScreen,lytSetting,lytSearchScreen,lytFavouriteScreen,lytProfileScreen,lytEcommerceScreen,lytPostCommentsScreen,lytRegistrationScreen,lytMainScreen;
    private CardView cardMain,cardRegistration,cardLogin,cardProfile,cardFavourite,cardSetting,cardSearch;
    private CardView cardLoginEcommerce,cardLoginUpblog,cardRegistrationUpblog,cardRegistrationEcommerce,cardMainEcommerce,cardMainUpblog;
    private ImageView imgArrowLogin,imgArrowRegistration,imgArrowProfile,imgArrowFavourite,imgArrowSearch,imgArrowMain,imgArrowPostComments,imgArrowSetting;
    private CardView cardProfileUpblog,cardSearchUpblog,cardProfileEcommerce,cardFavouriteUpblog,cardSettingEcomerce,cardFavouriteEcommerce;
    private CardView cardCommentsUpblog,cardPostUpblog,cardPostComments,cardEcommerce,cardEcommerceCheckOut,cardEcommerceCart,cardEcommerceProduct;

    public MainDropDownFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main_drop_down, container, false);

        init(v);

        cardCommentsUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), SinglePostCommentsActivity.class);
                startActivity(i);
            }
        });

        cardPostUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), SinglePostActivity.class);
                startActivity(i);
            }
        });

        cardLoginEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), LogInActivity.class);
                startActivity(i);
            }
        });

        cardEcommerceCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), CartActivity.class);
                startActivity(i);
            }
        });

        cardEcommerceCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), CheckoutActivity.class);
                startActivity(i);
            }
        });

        cardEcommerceProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), ProductDetail.class);
                startActivity(i);
            }
        });

        cardProfileUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), UpBlogMainActivity.class);
                i.putExtra("fragCall", "profile");
                startActivity(i);
            }
        });

        cardSearchUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), UpBlogMainActivity.class);
                i.putExtra("fragCall", "search");
                startActivity(i);
            }
        });

        cardFavouriteEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EcomerceMainActivity.class);
                i.putExtra("fragCall", "favourite");
                startActivity(i);
            }
        });

        cardSettingEcomerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EcomerceMainActivity.class);
                i.putExtra("fragCall", "setting");
                startActivity(i);
            }
        });

        cardFavouriteUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), UpBlogMainActivity.class);
                i.putExtra("fragCall", "favourite");
                startActivity(i);
            }
        });

        cardProfileEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EcomerceMainActivity.class);
                i.putExtra("fragCall", "profile");
                startActivity(i);
            }
        });

        cardLoginUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        cardRegistrationUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), RegistrationActivity.class);
                startActivity(i);
            }
        });

        cardRegistrationEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), RegisterActivity.class);
                startActivity(i);
            }
        });

        cardMainEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), EcomerceMainActivity.class);
                i.putExtra("fragCall", "main");
                startActivity(i);
            }
        });

        cardMainUpblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), UpBlogMainActivity.class);
                i.putExtra("fragCall", "main");
                startActivity(i);
            }
        });

        cardMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytMainScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardMain,
                            new AutoTransition());
                    lytMainScreen.setVisibility(View.GONE);
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardMain,
                            new AutoTransition());
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytLoginScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytMainScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytLoginScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardLogin,
                            new AutoTransition());
                    lytLoginScreen.setVisibility(View.GONE);
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardLogin,
                            new AutoTransition());
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.VISIBLE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                }

            }
        });

        cardRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytRegistrationScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardRegistration,
                            new AutoTransition());
                    lytRegistrationScreen.setVisibility(View.GONE);
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardRegistration,
                            new AutoTransition());
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytProfileScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardProfile,
                            new AutoTransition());
                    lytProfileScreen.setVisibility(View.GONE);
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardProfile,
                            new AutoTransition());
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytFavouriteScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardFavourite,
                            new AutoTransition());
                    lytFavouriteScreen.setVisibility(View.GONE);
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardFavourite,
                            new AutoTransition());
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytSearchScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardSearch,
                            new AutoTransition());
                    lytSearchScreen.setVisibility(View.GONE);
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardSearch,
                            new AutoTransition());
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytSetting.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardSetting,
                            new AutoTransition());
                    lytSetting.setVisibility(View.GONE);
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardSetting,
                            new AutoTransition());
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.VISIBLE);
                }

            }
        });

        cardPostComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytPostCommentsScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardPostComments,
                            new AutoTransition());
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    imgArrowPostComments.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardPostComments,
                            new AutoTransition());
                    imgArrowPostComments.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.VISIBLE);
                }

            }
        });

        cardEcommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (lytEcommerceScreen.getVisibility() == View.VISIBLE) {

                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardEcommerce,
                            new AutoTransition());
                    lytEcommerceScreen.setVisibility(View.GONE);
                    imgArrowPostComments.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else {

                    TransitionManager.beginDelayedTransition(cardEcommerce,
                            new AutoTransition());
                    imgArrowPostComments.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_up_24));
                    imgArrowSetting.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowSearch.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowRegistration.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowMain.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowFavourite.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowLogin.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    imgArrowProfile.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_drop_down_24));
                    lytMainScreen.setVisibility(View.GONE);
                    lytLoginScreen.setVisibility(View.GONE);
                    lytRegistrationScreen.setVisibility(View.GONE);
                    lytProfileScreen.setVisibility(View.GONE);
                    lytFavouriteScreen.setVisibility(View.GONE);
                    lytSearchScreen.setVisibility(View.GONE);
                    lytSetting.setVisibility(View.GONE);
                    lytPostCommentsScreen.setVisibility(View.GONE);
                    lytEcommerceScreen.setVisibility(View.VISIBLE);
                }

            }
        });


        return v;
    }

    private void init(View v) {
        cardFavouriteEcommerce = v.findViewById(R.id.cardFavouriteEcommerce);
        cardSettingEcomerce = v.findViewById(R.id.cardSettingEcomerce);
        cardFavourite = v.findViewById(R.id.cardFavourite);
        cardSearch = v.findViewById(R.id.cardSearch);
        cardSetting = v.findViewById(R.id.cardSetting);
        cardProfile = v.findViewById(R.id.cardProfile);
        cardProfileUpblog = v.findViewById(R.id.cardProfileUpblog);
        cardCommentsUpblog = v.findViewById(R.id.cardCommentsUpblog);
        cardPostUpblog = v.findViewById(R.id.cardPostUpblog);
        cardPostComments = v.findViewById(R.id.cardPostComments);
        cardEcommerce = v.findViewById(R.id.cardEcommerce);
        cardEcommerceCart = v.findViewById(R.id.cardEcommerceCart);
        cardEcommerceProduct = v.findViewById(R.id.cardEcommerceProduct);
        cardEcommerceCheckOut = v.findViewById(R.id.cardEcommerceCheckOut);
        cardProfileEcommerce = v.findViewById(R.id.cardProfileEcommerce);
        cardSearchUpblog = v.findViewById(R.id.cardSearchUpblog);
        cardFavouriteUpblog = v.findViewById(R.id.cardFavouriteUpblog);
        imgArrowLogin = v.findViewById(R.id.imgArrowLogin);
        imgArrowRegistration = v.findViewById(R.id.imgArrowRegistration);
        imgArrowMain = v.findViewById(R.id.imgArrowMain);
        imgArrowPostComments = v.findViewById(R.id.imgArrowPostComments);
        imgArrowSetting = v.findViewById(R.id.imgArrowSetting);
        imgArrowSearch = v.findViewById(R.id.imgArrowSearch);
        imgArrowFavourite = v.findViewById(R.id.imgArrowFavourite);
        imgArrowProfile = v.findViewById(R.id.imgArrowProfile);
        cardLoginEcommerce = v.findViewById(R.id.cardLoginEcommerce);
        cardLoginUpblog = v.findViewById(R.id.cardLoginUpblog);
        cardRegistrationUpblog = v.findViewById(R.id.cardRegistrationUpblog);
        cardRegistrationEcommerce = v.findViewById(R.id.cardRegistrationEcommerce);
        cardMainEcommerce = v.findViewById(R.id.cardMainEcommerce);
        cardMainUpblog = v.findViewById(R.id.cardMainUpblog);

        cardLogin = v.findViewById(R.id.cardLogin);
        cardRegistration = v.findViewById(R.id.cardRegistration);
        cardMain = v.findViewById(R.id.cardMain);

        lytLoginScreen = v.findViewById(R.id.lytLoginScreen);
        lytRegistrationScreen = v.findViewById(R.id.lytRegistrationScreen);
        lytProfileScreen = v.findViewById(R.id.lytProfileScreen);
        lytEcommerceScreen = v.findViewById(R.id.lytEcommerceScreen);
        lytPostCommentsScreen = v.findViewById(R.id.lytPostCommentsScreen);
        lytFavouriteScreen = v.findViewById(R.id.lytFavouriteScreen);
        lytSearchScreen = v.findViewById(R.id.lytSearchScreen);
        lytSetting = v.findViewById(R.id.lytSetting);
        lytMainScreen = v.findViewById(R.id.lytMainScreen);
    }
}