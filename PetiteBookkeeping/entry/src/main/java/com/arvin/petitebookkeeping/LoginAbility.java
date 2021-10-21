package com.arvin.petitebookkeeping;

import com.arvin.petitebookkeeping.slice.LoginAbilitySlice;
import com.arvin.petitebookkeeping.slice.RegisterAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class LoginAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(LoginAbilitySlice.class.getName());
        super.addActionRoute("action.register", RegisterAbilitySlice.class.getName());

    }
}
