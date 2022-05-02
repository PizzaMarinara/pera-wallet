/*
 * Copyright 2022 Pera Wallet, LDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.algorand.android.nft.ui.nftlisting.viewholder

import android.view.ViewGroup
import com.algorand.android.R
import com.algorand.android.databinding.ItemBaseCollectibleListBinding
import com.algorand.android.nft.ui.model.BaseCollectibleListItem

class CollectibleNotSupportedViewHolder(
    binding: ItemBaseCollectibleListBinding
) : BaseCollectibleListViewHolder(binding) {

    override fun bind(item: BaseCollectibleListItem.BaseCollectibleItem) {
        super.bind(item)
        if (item !is BaseCollectibleListItem.BaseCollectibleItem.NotSupportedCollectibleItem) return
        showWarningIcon(R.drawable.ic_error)
        binding.collectibleImageView.showText(item.avatarDisplayText)
    }

    companion object : NftListViewHolderCreator {
        override fun create(parent: ViewGroup): BaseCollectibleListViewHolder {
            return CollectibleNotSupportedViewHolder(createItemNftListBinding(parent))
        }
    }
}
