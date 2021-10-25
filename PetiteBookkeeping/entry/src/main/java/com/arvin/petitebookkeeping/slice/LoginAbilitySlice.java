package com.arvin.petitebookkeeping.slice;

import com.arvin.petitebookkeeping.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class LoginAbilitySlice extends AbilitySlice {

    Button btnLogin,btnRegister;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_login);
        initComponent();
    }

    private void initComponent(){
        btnLogin = (Button) findComponentById(ResourceTable.Id_btn_login);
        btnRegister = (Button) findComponentById(ResourceTable.Id_btn_register);
        btnLogin.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Operation operation = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.arvin.petitebookkeeping")
                        .withAbilityName("MainAbility")
                        .build();
                intent.setOperation(operation);
                startAbility(intent);
            }
        });

        btnRegister.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                present(new RegisterAbilitySlice(),intent);
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
