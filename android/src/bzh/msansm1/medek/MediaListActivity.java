package bzh.msansm1.medek;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class MediaListActivity extends FragmentActivity
        implements MediaListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_list);

        if (findViewById(R.id.media_detail_container) != null) {
            mTwoPane = true;
            ((MediaListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.media_list))
                    .setActivateOnItemClick(true);
        }
    }

    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(MediaDetailFragment.ARG_ITEM_ID, id);
            MediaDetailFragment fragment = new MediaDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.media_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, MediaDetailActivity.class);
            detailIntent.putExtra(MediaDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
