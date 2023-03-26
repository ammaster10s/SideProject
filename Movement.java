interface  Movement {
    abstract void movement(){
        try {
            // Load original PNG images
            Image originalBlack = ImageIO.read(new File("Wpawn.png"));
            Image originalWhite = ImageIO.read(new File("Bpawn.png"));

            // Resize images to 100x100 pixels
            Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            // Create new ImageIcon objects from resized images
            imgblack = new ImageIcon(resizedBlack);
            imgwhite = new ImageIcon(resizedWhite);

            // Set the icons for the JLabels
            jlPicblack.setIcon(imgblack);
            jlPicwhite.setIcon(imgwhite);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
