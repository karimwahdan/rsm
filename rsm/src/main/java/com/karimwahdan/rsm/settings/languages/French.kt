@file:Suppress("SpellCheckingInspection")

package com.karimwahdan.rsm.settings.languages
class French {

    val generalTexts = GeneralText(
        items = "articles",
        alternativeMobileNoString = "numéro de portable alternatif",
        address = "Adresse",
        landmark = "Point de repère",
        city = "Ville",
        area = "Zone",
        error_loading_city = "Erreur lors du chargement des villes",
        loading_city = "Chargement des villes",
        address_type = "Type d'adresse",
        select = "Sélectionner",
        street = "Rue",
        totalItems = "Total des articles",
        orderPrice = "Prix de la commande",
        deliveryType = "Type de livraison",
        deliveryPrice = "Prix de livraison",
        taxPrice = "Prix des taxes",
        grandTotal = "Total général",
        canReturnWithin = "retour sous",
        day = "jours",
        selectDeliveryAddress = "Veuillez sélectionner l'adresse de livraison",
        noData = "Pas de données",
        paymentCannotBeCompleted = "Le paiement ne peut pas être effectué",
        orderCode = "Code de commande",
        discountPrice = "Prix remisé",
        products = "Produits",
        promoCode = "Code promo",
        originalPrice = "Prix d'origine",
        expiryDate = "Date d'expiration",
        total = "Total",
        expectedDeliveryDate = "Date de livraison prévue",
        from = "de",
        to = "à",
        color = "Color",
        length = "Length",
        height = "Height",
        material = "Material",
        size = "Size",
        thickness = "Thickness",
        weight = "Weight",
        width = "Width"


    )

    val buttonLanguage = ButtonLanguage(
        id = 1,
        project_id = 1,
        language = FR,  // Change language to French
        addToCartButtonText = "Ajouter au panier",
        goToCartButtonText = "Aller au panier",
        clearButtonText = "Vider le Panier",
        continueButtonText = "CONTINUER",
        deleteButtonText = "SUPPRIMER",
        changeButtonText = "Changer",
        proceedButtonText = "PROCÉDER",
        saveForLaterButtonText = "Enregistrer pour plus tard",
        pickupFromStoreButtonText = "Récupérer en magasin",
        doorStepDeliveryButtonText = "Livraison à domicile",
        cancelButtonText = "Annuler",
        confirmButtonText = "Confirmer",
        registerButtonText = "S'inscrire",
        signupButtonText = "S'inscrire",
        loginText = "Se connecter",
        homeButtonText = "Accueil",
        categoriesButtonText = "Catégories",
        wishlistButtonText = "Liste de souhaits",
        accountButtonText = "Mon profil",
        shopNow = "Achetez maintenant",
    )

    // For ProfilePageLanguage
    val profilePageLanguage = ProfilePageLanguage(
        id = 1,
        project_id = 1,
        language = FR,
        homeText = "Accueil",
        myCartText = "Mon panier",
        notificationsText = "Notifications",
        myOrdersText = "Mes commandes",
        myTransactionsHistoryText = "Historique de mes transactions",
        changeMyPasswordText = "Changer mon mot de passe",
        manageMyAddressesText = "Gérer mes adresses",
        contactUsText = "Nous contacter",
        aboutUsText = "À propos de nous",
        rateUsText = "Évaluez-nous",
        shareAppText = "Partager l'application",
        faqText = "Foire aux questions",
        termsAndConditionsText = "Conditions générales",
        privacyText = "Politique de confidentialité",
        developersText = "Contacter les développeurs",
        changeLanguageText = "Changer de langue",
        logoutText = "Se déconnecter",
        projectLogoutText = "Déconnexion de l'aperçu du magasin"

    )

    // For ProjectLanguage
    val projectLanguage = ProjectLanguage(
        id = 1,
        project_id = 1,
        language = FR,
        appName = "Revit Store",
        topBarWelcome = "Bienvenue de retour,",
        searchProductPlaceholder = "Rechercher un produit",
        shopByCategory = "Acheter par catégorie",
        viewAll = "Voir tout",
        wishlistText = "Ajouter à la liste de souhaits",
        shareText = "Partager",
        similarProductsText = "Produits similaires",
        quantityText = "Quantité",
        shippingDetailsText = "Détails de livraison",
        orderSummaryText = "Résumé de la commande",
        unitPriceText = "Prix unitaire",
        totalText = "Total",
        subTotalText = "Sous-total",
        deliveryChargeText = "Frais de livraison",
        taxText = "Taxe", youSavedText = "Vous avez économisé",
        grandTotalText = "Total général",
        itemsTotalValueText = "Valeur totale des articles",
        aboutThisItemText = "À propos de ce produit",
        confirmOrderText = "Confirmer la commande",
        defaultText = "Par défaut",
        addressDetailsText = "Détails",
        welcomeToText = "Bienvenue sur",
        forgotYourPasswordText = "Mot de passe oublié ?!",
        allProducts = "Tous les produits",
        allProductsContent = "Tous les produits que nous proposons",
        loginFirst = "S'il vous plait Connectez-vous d'abord",
        addressTypeHome = "Accueil",
        addressTypeOffice = "Travail",
        addressTypeOther = "Autre"
    )

    // For RegisterPageLanguage
    val registerPageLanguage = RegisterPageLanguage(
        id = 1,
        project_id = 1,
        language = FR,
        firstNameText = "Prénom",
        middleNameText = "Deuxième prénom",
        lastNameText = "Nom de famille",
        emailText = "E-mail",
        usernameText = "Nom d'utilisateur",
        passwordText = "Mot de passe",
        passwordConfirmationText = "Confirmation du mot de passe",
        countryText = "Pays",
        mobileText = "Numéro de mobile",
        nameText = "Nom",
        usernameEmailMobileText = "Nom d'utilisateur ou adresse e-mail ou numéro de mobile"
    )
}