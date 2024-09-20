# RecyclerView with ImageView and Glide

This Android project demonstrates the use of `RecyclerView` to display a list of images efficiently, utilizing the `Glide` library for image loading and caching.

## Features

- **RecyclerView**: Efficiently displays a scrollable list of items.
- **ImageView**: Shows images for each item in the RecyclerView.
- **Glide**: Handles image loading, caching, and optimization for smooth scrolling.

## Technologies Used

- **RecyclerView**: Efficient and flexible way of displaying large datasets.
- **ImageView**: Android's view for displaying images.
- **Glide**: Image loading and caching library for smooth performance.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ayushsgithub/recyclerView_imageView_Glide.git
   ```
2. Open the project in Android Studio.

3. Sync the project with Gradle to install dependencies.

## Dependencies

Ensure you have the following dependencies in your `build.gradle` file:
```gradle
implementation 'androidx.recyclerview:recyclerview:1.2.1'
implementation 'com.github.bumptech.glide:glide:4.12.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
```

## Usage

1. **RecyclerView Adapter**: Customize the `RecyclerViewAdapter` to bind data (image URLs) to the views.
2. **Glide Integration**: Glide loads the images from URLs or local resources into the `ImageView` within the `onBindViewHolder()` method.

   Example code:

   ```
   Glide.with(context)
        .load(imageUrl)
        .placeholder(R.drawable.placeholder_image) // Optional placeholder
        .into(holder.imageView); 
   ```


3. **Run the App**: Build and run the app on an emulator or physical device to see the images being loaded in the `RecyclerView`.

## Screenshots

![Video Link](https://github.com/ayushsgithub/recyclerView_imageView_Glide/blob/main/app/images/Screenshot.png?raw=true)

## License

This project is open source and available under the [MIT License](LICENSE).