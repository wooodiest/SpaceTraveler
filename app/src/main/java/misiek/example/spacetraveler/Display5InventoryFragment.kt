package misiek.example.spacetraveler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class Display5InventoryFragment : Fragment() {

    //////////////////////////////////////
    /// Declaring view type data ///
    private lateinit var gameDisplay: FrameLayout
    private lateinit var shopBar: TextView
    private lateinit var inventoryBar: TextView
    ///\\\ Declaring view type data \\\///
    //////////////////////////////////////
    /// On start game data ///
    private var currentFragment: Int = 0
    ///\\\ On start game data \\\///

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_display5_inventory, container, false)
        //////////////////////////////////////
        /// Assigning id's ///
        root.apply {
            gameDisplay = findViewById(R.id.flMainGameDisplayInventory)
            shopBar = findViewById(R.id.txvMainGameDisplayInventoryShopBar)
            inventoryBar = findViewById(R.id.txvMainGameDisplayInventoryItemsBar)
        }
        ///\\\ Assigning id's \\\///
        //////////////////////////////////////
        /// Assigning translations ///
        shopBar.text = shopBarText
        inventoryBar.text = inventoryBarText
        ///\\\ Assigning translations \\\///
        //////////////////////////////////////
        /// Starting game ///
        turnOnStartingFragment()
        ///\\\ Starting game \\\///
        //////////////////////////////////////
        /// Game onClick actions ///
        shopBar.setOnClickListener {
            if (firstOpen == 0 && tutorialStep !=7 )switchToShopOrItems(shop = true)

        }
        inventoryBar.setOnClickListener {
            if (firstOpen == 0 && tutorialStep != 6) {
                hideKeyboard()
                switchToShopOrItems(items = true)
            }
            if (firstOpen == 1 && tutorialStep == 7) {
                switchToShopOrItems(items = true)
                (parentFragment as MainGameDisplayFragment).setTutorialStep7Stuff()
            }
        }
        ///\\\ Game onClick actions \\\///
        //////////////////////////////////////
        return root
    }


    private fun turnOnStartingFragment() {
        /// Creating starting fragment that will show space fragment without sound...
        val fragment = Display5InventoryShopFragment()
        val fragmentTransaction: FragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(gameDisplay.id, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
        //////////////////////////////////////
        shopBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
        inventoryBar.setBackgroundResource(R.color.backgroundValuableItems)
        currentFragment = 1
    }
    private fun switchToShopOrItems(shop: Boolean = false, items: Boolean = false) {
        /// Create an auxiliary variable that will reflect the selection and assigning it to the appropriate value
        var intWhich: Int? = 0
        if (shop) intWhich = 1
        if (items) intWhich = 2
        /// Check user want to switch to fragment already shown
        if (intWhich == currentFragment || intWhich == 0) return
        /// Play sound after clicking the bottom toolbar and fragment could be changed
        playSound(requireContext(), importantTap = true)
        /// Creating a variable that will store the player's choice and assigning an appropriate value to it and choosing bar color assignment
        var fragment: Fragment? = null
        when(intWhich) {
            1 -> {
                fragment = Display5InventoryShopFragment()
                shopBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
                inventoryBar.setBackgroundResource(R.color.backgroundValuableItems)
            }
            2 -> {
                fragment = Display5InventoryItemsFragment()
                shopBar.setBackgroundResource(R.color.backgroundValuableItems)
                inventoryBar.setBackgroundResource(R.color.transparent60BackgroundValuableItems)
            }
        }
        if (intWhich!! > currentFragment) {
            val fragmentTransaction: FragmentTransaction = childFragmentManager.
            beginTransaction().setCustomAnimations(R.anim.in_from_right, R.anim.out_to_right)
            fragmentTransaction.replace(gameDisplay.id, fragment!!)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        } else {
            val fragmentTransaction: FragmentTransaction = childFragmentManager.
            beginTransaction().setCustomAnimations(R.anim.in_from_left, R.anim.out_to_left)
            fragmentTransaction.replace(gameDisplay.id, fragment!!)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        /// Assigning a new appropriate value to the current fragment variable
        currentFragment = intWhich
    }
    fun switchToDisplayToken(token: ShopToken) {
        (parentFragment as MainGameDisplayFragment).switchToDisplayToken(token)
    }
}