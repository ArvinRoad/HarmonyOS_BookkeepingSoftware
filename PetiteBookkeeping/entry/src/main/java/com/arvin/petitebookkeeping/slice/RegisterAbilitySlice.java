package com.arvin.petitebookkeeping.slice;

import com.arvin.petitebookkeeping.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class RegisterAbilitySlice extends AbilitySlice {

    Button btnRegister,btnCancel;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_register);
        initComponent();
    }

    private void initComponent() {
        btnRegister = (Button) findComponentById(ResourceTable.Id_btn_register);
        btnCancel = (Button) findComponentById(ResourceTable.Id_btn_cancel);
        btnRegister.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {

            }
        });

        btnCancel.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                present(new LoginAbilitySlice(),intent);
            }
        });
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
