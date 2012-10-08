package bzh.msansm1.medek;

import bzh.msansm1.medek.dummy.MainContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MediaDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    MainContent.MainItem mItem;

    public MediaDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = MainContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_media_detail, container, false);
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.media_detail)).setText(mItem.content);
        }
        return rootView;
    }
}
