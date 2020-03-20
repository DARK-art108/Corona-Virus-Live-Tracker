package com.ritesh.coronavirustracker.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ritesh.coronavirustracker.ui.AboutFragment
import com.ritesh.coronavirustracker.ui.AdviceFragment
import com.ritesh.coronavirustracker.ui.MapsFragment
import com.ritesh.coronavirustracker.ui.StatsFragment

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> StatsFragment()
            1 -> MapsFragment()
            2 -> AdviceFragment()
            3 -> AboutFragment()
            else -> StatsFragment()
        }
    }

    override fun getCount(): Int = 4

}