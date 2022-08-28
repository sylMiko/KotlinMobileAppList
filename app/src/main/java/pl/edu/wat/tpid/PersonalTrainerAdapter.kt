package pl.edu.wat.tpid

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import pl.edu.wat.tpid.model.PersonalTrainer

class PersonalTrainerAdapter
    : BaseQuickAdapter<PersonalTrainer, BaseViewHolder>(R.layout.item_personal_trainer) {

    init {
        addChildClickViewIds(R.id.pt_content)
    }

    override fun convert(holder: BaseViewHolder, item: PersonalTrainer) {
        holder.setText(R.id.pt_name, item.firstName + " " + item.lastName)
        holder.setText(R.id.pt_age, item.age.toString())
        holder.setText(R.id.pt_address, item.address)
    }

}