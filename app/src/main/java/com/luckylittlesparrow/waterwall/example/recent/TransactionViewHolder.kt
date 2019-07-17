/*
 *  Copyright 2019 Gusev Andrei
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.luckylittlesparrow.waterwall.example.recent

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.luckylittlesparrow.waterwall.recycler.base.BaseViewHolder
import kotlinx.android.synthetic.main.transactiom_view_item.view.*


class TransactionViewHolder(
    view: View
) : BaseViewHolder<TransactionItem>(view) {

    private val transactionAmountTextView: TextView = view.transactionItemAmountTextView
    private val transactionDescriptionTextView: TextView = view.transactionItemDescriptionTextView
    private val transactionIconImageView: ImageView = view.transactionItemTypeImageView
    private val transactionItemAmountTextView: ImageView = view.transactionItemStatusImageView

    override fun bindItem(item: TransactionItem) {
        super.bindItem(item)
        transactionAmountTextView.text = item.value
        transactionDescriptionTextView.text = item.message
        transactionIconImageView.setImageResource(item.typeImageResource)
        transactionItemAmountTextView.setImageResource(item.statusImageResource)
    }
}
