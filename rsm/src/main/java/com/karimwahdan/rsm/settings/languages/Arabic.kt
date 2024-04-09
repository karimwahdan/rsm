@file:Suppress("SpellCheckingInspection")

package com.karimwahdan.rsm.settings.languages


class Arabic {

    val generalTexts= GeneralText(items="اصناف",
    alternativeMobileNoString = "رقم الهاتف البديل",
        address="Address",
        landmark="Landmark",
        city = "المدينة",
        error_loading_city = "حدث خطأ اثناء تحميل المدن",
        loading_city = "جارى تحميل المدن",
        area = "المنطقة",
        address_type = "نوع العنوان",
        select = "أختر",
        street="الشارع",
        totalItems="اجمالى عدد الأصناف",
        orderPrice="قيمة الطلب",
        deliveryType="نوع التوصيل",
        deliveryPrice="مصاريف التوصيل",
        taxPrice="قيمة الضريبة",
        grandTotal="الإجمالى",
        canReturnWithin = " الاسترجاع خلال ",
        day=" يوم ",
        selectDeliveryAddress = "من فضلك اختر عنوان التوصيل",
        noData = "لا يوجد بيانات",
        paymentCannotBeCompleted = "لا يمكن استكمال الطلب",
        orderCode = "كود الطلب",
        discountPrice = "السعر بعد الخصم",
        products = "المنتجات",
        promoCode = "كود الخصم",
        originalPrice=" السعر ",
        expiryDate = "تاريخ الصلاحية",
        total="الاجمالى",
        expectedDeliveryDate = "تاريخ الاستلام المتوقع",
        from = "من",
        to = "الى",
        color = "اللون",
        length = "الطول",
        height = "الارتفاع",
        material = "الخامة",
        size = "الحجم",
        thickness = "السمك",
        weight = "الوزن",
        width = "العرض"
    )

    val buttonLanguage = ButtonLanguage(
        id = 1,
        project_id = 1,
        language = AR,  // Change language to Arabic
        addToCartButtonText = "أضف إلى السلة",
        goToCartButtonText = "الانتقال إلى السلة",
        clearButtonText = "حذف السلة",
        continueButtonText = "متابعة",
        deleteButtonText = "حذف",
        changeButtonText = "تغيير",
        proceedButtonText = "المتابعة",
        saveForLaterButtonText = "حفظ لاحقًا",
        pickupFromStoreButtonText = "التقاط من المتجر",
        doorStepDeliveryButtonText = "توصيل حتى الباب",
        cancelButtonText = "إلغاء",
        confirmButtonText = "تأكيد",
        registerButtonText = "تسجيل",
        signupButtonText = "التسجيل",
        loginText = "تسجيل الدخول",
        homeButtonText = "الرئيسية",
        categoriesButtonText = "الفئات",
        wishlistButtonText = "قائمة الرغبات",
        accountButtonText = "حسابى",
        shopNow = "تسوق الآن"
    )
    // For ProfilePageLanguage
    val profilePageLanguage = ProfilePageLanguage(
        id = 1,
        project_id = 1,
        language = AR,
        homeText = "الرئيسية", myCartText = "عربة التسوق", notificationsText = "الإشعارات",
        myOrdersText = "طلباتي", myTransactionsHistoryText = "سجل معاملاتي",
        changeMyPasswordText = "تغيير كلمة المرور",
        manageMyAddressesText = "إدارة عناويني", contactUsText = "اتصل بنا",
        aboutUsText = "من نحن", rateUsText = "قيمنا", shareAppText = "مشاركة التطبيق",
        faqText = "الأسئلة الشائعة", termsAndConditionsText = "الشروط والأحكام",
        privacyText = "سياسة الخصوصية",
        developersText = "اتصل بالمطورين",
        changeLanguageText="غير اللغة",
        logoutText = "تسجيل الخروج",
        projectLogoutText = "تسجيل خروج من عرض المتجر"
    )

    // For ProjectLanguage
    val projectLanguage = ProjectLanguage(
        id = 1,
        project_id = 1,
        language = AR,
        appName = "ريفيت استور",
        topBarWelcome = "مرحبًا مرة أخرى،",
        searchProductPlaceholder = "ابحث عن المنتج",
        shopByCategory = "تسوق حسب الفئة",
        viewAll = "عرض الكل",
        wishlistText = "إضافة إلى قائمة الرغبات",
        shareText = "مشاركة",
        similarProductsText = "منتجات مماثلة",
        quantityText = "الكمية",
        shippingDetailsText = "تفاصيل الشحن",
        orderSummaryText = "ملخص الطلب",
        unitPriceText = "سعر الوحدة",
        totalText = "الإجمالي",
        subTotalText = "مجموع الطلبات",
        deliveryChargeText = "رسوم التوصيل",
        taxText = "الضريبة",
        youSavedText = "لقد وفرت",
        grandTotalText = "المجموع الكلي",
        itemsTotalValueText = "قيمة المنتجات الإجمالية",
        aboutThisItemText = "حول هذا المنتج",
        confirmOrderText = "تأكيد الطلب",
        defaultText = "الافتراضي",
        addressDetailsText = "تفاصيل",
        welcomeToText = "مرحبًا في",
        forgotYourPasswordText = "هل نسيت كلمة المرور؟",
        allProducts = "كل المنتجات",
        allProductsContent = "كل المنتجات التى نقدمها",
        loginFirst = "من فضلك سجل اولا",
        addressTypeHome = "منزل",
        addressTypeOffice = "العمل",
        addressTypeOther = "اخرى"

    )

    // For RegisterPageLanguage
    val registerPageLanguage = RegisterPageLanguage(
        id = 1,
        project_id = 1,
        language = AR,
        firstNameText = "الاسم الأول",
        middleNameText = "الاسم الأوسط",
        lastNameText = "الاسم الأخير",
        emailText = "البريد الإلكتروني",
        usernameText = "اسم المستخدم",
        passwordText = "كلمة المرور",
        passwordConfirmationText = "تأكيد كلمة المرور",
        countryText = "الدولة",
        mobileText = "رقم الجوال",
        nameText = "الاسم",
        usernameEmailMobileText = "اسم المستخدم أو البريد الإلكتروني أو رقم الجوال"

    )
}