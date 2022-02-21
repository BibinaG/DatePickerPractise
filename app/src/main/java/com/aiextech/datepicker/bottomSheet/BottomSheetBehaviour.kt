package com.aiextech.datepicker.bottomSheet

import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BottomSheetBehaviour {
    companion object {
        fun BottomSheetBehavior<View>.expand() {
            state = BottomSheetBehavior.STATE_EXPANDED
        }

        fun BottomSheetBehavior<View>.collapse() {
            peekHeight = 0
            state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}