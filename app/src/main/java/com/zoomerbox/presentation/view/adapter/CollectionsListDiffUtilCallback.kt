package com.zoomerbox.presentation.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.zoomerbox.model.dto.CollectionDTO

class CollectionsListDiffUtilCallback(
    private val oldCollections: List<CollectionDTO>,
    private val newCollections: List<CollectionDTO>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldCollections.size
    }

    override fun getNewListSize(): Int {
        return newCollections.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldCollections[oldItemPosition].collectionName == newCollections[newItemPosition].collectionName
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldCollections[oldItemPosition].boxes.containsAll(newCollections[newItemPosition].boxes)
                && newCollections[newItemPosition].boxes.containsAll(oldCollections[oldItemPosition].boxes)
    }
}
