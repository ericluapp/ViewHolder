package com.ericluapp.android.libs;


import android.view.View;

import com.ericluapp.android.libs.R;

class SimpleOnRecyclerViewItemClickListener implements OnRecyclerViewItemClickListener {
    @Override
    public void onItemClick(ViewHolder holder, int position) {
    }

    @Override
    public void onClick(View v) {
    }

    static ViewHolder getViewHolder(View v) {
        return (ViewHolder) v.getTag(R.id.tag_viewholder);
    }

}
