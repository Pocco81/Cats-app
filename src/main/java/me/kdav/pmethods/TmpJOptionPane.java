package me.kdav.pmethods;


import javax.swing.ImageIcon;


/**
 * TmpJOptionPane
 */
public class TmpJOptionPane {

    // null
    String subTitle = "";
    String winTitle = "";
    // jframe type
    ImageIcon imgIcon = null;
    // buttons
    // buttons[0]

    public TmpJOptionPane() {
        ;
    }

    public TmpJOptionPane(String subTitle, String winTitle, ImageIcon imgIcon) {
        this.subTitle = subTitle;
        this.winTitle = winTitle;
        this.imgIcon = imgIcon;
    }

    /**
     * Get subTitle.
     *
     * @return subTitle as String.
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Set subTitle.
     *
     * @param subTitle the value to set.
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * Get winTitle.
     *
     * @return winTitle as String.
     */
    public String getWinTitle() {
        return winTitle;
    }

    /**
     * Set winTitle.
     *
     * @param winTitle the value to set.
     */
    public void setWinTitle(String winTitle) {
        this.winTitle = winTitle;
    }

    /**
     * Get imgIcon.
     *
     * @return imgIcon as ImageIcon.
     */
    public ImageIcon getImgIcon() {
        return imgIcon;
    }

    /**
     * Set imgIcon.
     *
     * @param imgIcon the value to set.
     */
    public void setImgIcon(ImageIcon imgIcon) {
        this.imgIcon = imgIcon;
    }
}
