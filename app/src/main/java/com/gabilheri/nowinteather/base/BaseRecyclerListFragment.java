package com.gabilheri.nowinteather.base;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gabilheri.nowinteather.R;

import butterknife.Bind;

/**
 * Created by <a href="mailto:marcusandreog@gmail.com">Marcus Gabilheri</a>
 *
 * @author Marcus Gabilheri
 * @version 1.0
 * @since 9/7/15.
 */
public abstract class BaseRecyclerListFragment extends BaseFragment {

    @Bind(R.id.recyclerview)
    protected RecyclerView mRecyclerView;

    protected GridLayoutManager mGridLayoutManager;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    protected void initGridCardsList(RecyclerView.Adapter adapter) {
        int numCols = getResources().getInteger(R.integer.num_cols);
        mGridLayoutManager = new GridLayoutManager(mRecyclerView.getContext(), numCols);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.list_fragment;
    }
}
