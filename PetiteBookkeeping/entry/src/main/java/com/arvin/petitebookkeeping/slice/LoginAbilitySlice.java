package com.arvin.petitebookkeeping.slice;

import com.arvin.petitebookkeeping.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class LoginAbilitySlice extends AbilitySlice {

    TextField tfUsername;
    Button btnLogin,btnRegister;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_login);
        initComponent();
        String username = intent.getStringParam("username");
        if(username != null){
            tfUsername.setText(username);
        }
    }

    private void initComponent(){
        tfUsername = (TextField) findComponentById(ResourceTable.Id_tf_username);
        btnLogin = (Button) findComponentById(ResourceTable.Id_btn_login);
        btnLogin.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Operation operation = new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName("com.arvin.PetiteBookkeeping")
                        .withAbilityName("MainAbility")
                        .build();

                intent.setOperation(operation);

                String username = tfUsername.getText().toString();
                intent.setParam("username",username);
                
                startAbility(intent);
            }
        });

        btnRegister = (Button) findComponentById(ResourceTable.Id_btn_register);
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
