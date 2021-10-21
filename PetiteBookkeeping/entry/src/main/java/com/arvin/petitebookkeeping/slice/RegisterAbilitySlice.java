package com.arvin.petitebookkeeping.slice;

import com.arvin.petitebookkeeping.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class RegisterAbilitySlice extends AbilitySlice {
    TextField tfUsername;
    Button btnRegister,btnCancel;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_register);
        initComponent();
    }

    private void initComponent(){
        tfUsername = (TextField) findComponentById(ResourceTable.Id_tf_username);
        btnRegister = (Button) findComponentById(ResourceTable.Id_btn_register);
        btnRegister.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                String username = tfUsername.getText().toString();
                Intent intent = new Intent();
                intent.setParam("username",username);
                present(new LoginAbilitySlice(),intent);
            }
        });

        btnCancel = (Button) findComponentById(ResourceTable.Id_btn_cancel);
        btnCancel.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                present(new LoginAbilitySlice(),new Intent());
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
