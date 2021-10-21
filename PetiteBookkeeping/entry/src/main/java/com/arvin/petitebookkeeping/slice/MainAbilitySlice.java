package com.arvin.petitebookkeeping.slice;

import com.arvin.petitebookkeeping.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    Text textwelcome;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        textwelcome = (Text) findComponentById(ResourceTable.Id_text_welcome);
        String username = intent.getStringParam("username");
        if(username != null){
            textwelcome.setText(username+",欢迎您！");
        }else{
            textwelcome.setText("您还未注册！");
        }
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
